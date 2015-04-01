package ch12;

class Thread5 extends Thread {
	
	public void run() {
		
		for(int i=0; i< 300; i++) {
			System.out.print("|");
		}
		
		System.out.println("소요시간 2 :" + (System.currentTimeMillis() - Exam12_5.startTime));
	}
	
	
}
public class Exam12_5 {

	static long startTime = 0;
	
	public static void main(String[] args) {
		
		Thread5 th1 = new Thread5();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for (int i=0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println("소요시간 1: " + (System.currentTimeMillis() - Exam12_5.startTime));
		
	}
}
