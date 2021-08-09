package lectures.lecture_03.homework;

public class Test {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		});
		t1.start();
		t2.start();
	}
}

class Singleton{
	private static volatile Singleton singleton;
	private Singleton() {		
	}
	
	public static Singleton getInstance() {
		if(singleton==null) {//t2 thread
			synchronized(Singleton.class) { //t2 waiting
				if(singleton==null) {//t1 thread
					singleton = new Singleton();//(Scheduler took some time for acquire lock) /Reference Escaping / Read, Write Barrier
				}
			}
		}
		return singleton;
	}
}