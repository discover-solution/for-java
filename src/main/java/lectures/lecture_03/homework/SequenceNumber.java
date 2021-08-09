package lectures.lecture_03.homework;

/**
 * While printing numbers in sequence using threads trick is to use modulo division to 
 *  check which thread can print the number and which threads are to be blocked waiting.
 * 
 *  Each thread is assigned one of the numbers 0, 1 and 2. 
 *  Each number is divided by 3 (number of threads), 
 *  remainder will be any one of these numbers 0, 1 or 2. 
 *  That is what is checked; if (remainder = number assigned to thread) 
 *  only then thread can work otherwise it goes into waiting state.
 */
public class SequenceNumber {
    final static int NUMBER_IN_SEQUENCE = 19;
    final static int NUMBER_OF_THREADS = 4; 
    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter(NUMBER_IN_SEQUENCE, NUMBER_OF_THREADS);

        Thread t1 = new Thread(new SequenceRunnable(sharedPrinter, 1),"Thread 1");
        Thread t2 = new Thread(new SequenceRunnable(sharedPrinter, 2),"Thread 2");
        Thread t3 = new Thread(new SequenceRunnable(sharedPrinter, 3),"Thread 3");
        Thread t4 = new Thread(new SequenceRunnable(sharedPrinter, 0),"Thread 4");
        
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