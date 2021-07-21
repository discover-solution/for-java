package lectures.lecture_03.homework;

public class ThreadLambdaImpl {
    static Runnable run = () -> {
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
    };

    public static void main(String[] args) {
        Thread thread = new Thread(run);
        thread.start();
    }
    
}