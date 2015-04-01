package ch12;


class ThreadEx1 extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}
}


class ThreadEx2 implements Runnable {
	
	public void run() { 
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Exam12_1 {

	public static void main(String[] args) {
		
		ThreadEx1  t1 = new ThreadEx1();
	
		Runnable r = new ThreadEx2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}
	
	
}
