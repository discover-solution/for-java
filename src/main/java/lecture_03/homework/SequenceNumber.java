package lecture_03.homework;

/**
 * SequenceNumber
 */
public class SequenceNumber {
    final static int NUMBER_IN_SEQUENCE = 11;
    final static int NUMBER_OF_THREADS = 4; 
    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter(NUMBER_IN_SEQUENCE, NUMBER_OF_THREADS);

        Thread t1 = new Thread(new SequenceRunnable(sharedPrinter, 1),"Thread1");
        Thread t2 = new Thread(new SequenceRunnable(sharedPrinter, 2),"Thread2");
        Thread t3 = new Thread(new SequenceRunnable(sharedPrinter, 3),"Thread3");
        Thread t4 = new Thread(new SequenceRunnable(sharedPrinter, 0),"Thread4");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }    
}

class SharedPrinter{
    int number = 1;
    int numberOfThreads;
    int numberInSequence;

    SharedPrinter(int numberInSequence, int numberOfThreads){
        this.numberInSequence = numberInSequence;
        this.numberOfThreads = numberOfThreads;
    }

    public void printNum(int result){
        synchronized(this){
            while (number < numberInSequence - 1) {
                while (number % numberOfThreads != result) {
                    try{
                        this.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() +" : "+ number++);
                this.notifyAll();
            }
        }
    }
}

class SequenceRunnable implements Runnable{
    
    SharedPrinter sharedPrinter;
    int result;
    static Object sharedObject = new Object();

    SequenceRunnable(SharedPrinter sharedPrinter, int result){
        this.sharedPrinter = sharedPrinter;
        this.result = result;
    }

    @Override
    public void run(){
        sharedPrinter.printNum(result);
    }
}