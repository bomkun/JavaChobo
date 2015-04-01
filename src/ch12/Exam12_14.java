package ch12;

class Thread14_1 extends Thread {
	
	public void run() {
		for (int i =0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Thread14_2 extends Thread {
	
	public void run() {
		for (int i = 0; i <300; i++) {
			System.out.print("|");
		}
	}
}

public class Exam12_14 {
	
	
	public static void main(String args[]) {
		
		Thread14_1 th1 = new Thread14_1();
		Thread14_2 th2 = new Thread14_2();
		
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			
		}
		th2.start();
		
	}
}