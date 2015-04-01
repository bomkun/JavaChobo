package ch12;

class Thread13_1 extends Thread {
	
	public void run() {
		for (int i =0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Thread13_2 extends Thread {
	
	public void run() {
		for (int i = 0; i <300; i++) {
			System.out.print("|");
		}
	}
}

public class Exam12_13 {

	static long startTime = 0;
	
	public static void main(String[] args) {
		
		Thread13_1 th1 = new Thread13_1();
		Thread13_2 th2 = new Thread13_2();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("소요시간 :" + (System.currentTimeMillis() - Exam12_13.startTime));
	}
}
