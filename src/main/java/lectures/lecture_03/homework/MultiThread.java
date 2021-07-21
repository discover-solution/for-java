package lectures.lecture_03.homework;

public class MultiThread extends Thread{
    /**
     * Using internal classes, threads are unaware of x, and only Factory knows the changes in x. This avoids changes in x,
           * Other threads have not read the changed value, which avoids the problem of reading dirty data
     */

     private static class Factory{
         private static int x = 0;
         private static synchronized void printNum(){
             System.out.print(Thread.currentThread().getName() + " : "+x+" ");
             x++;
         }
     }

     private MultiThread(String name){
         super(name);
     }

     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             Factory.printNum();
         }
     }

     public static void main(String[] args) {
         Thread t1 = new MultiThread("t1");
         Thread t2 = new MultiThread("t2");
         Thread t3 = new MultiThread("t3");
         Thread t4 = new MultiThread("t4");

         t1.start();t2.start();t3.start();t4.start();
     }
}
