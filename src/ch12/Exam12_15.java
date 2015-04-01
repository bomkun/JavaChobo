package ch12;

class Thread15_1 extends Thread {
	
	public void run(){
		
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println("<<th1 종료>>");
	}
}

class Thread15_2 extends Thread {
	
	public void run(){
		
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		
		System.out.println("<<th2 종료>>");
	}
	
}

public class Exam12_15 {

	public static void main(String args[]) {
		
		
		Thread15_1 th1 = new Thread15_1(); 
		Thread15_2 th2 = new Thread15_2();
		
		th1.start();
		th2.start();
		
		try {
			th1.sleep(5000);
		} catch (InterruptedException e) {
		
		}
		
		System.out.println("<<main종료>>");
	}
}
