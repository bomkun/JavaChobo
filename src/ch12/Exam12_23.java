package ch12;

class Thread23 extends Thread {
	
	int iv = 0;
	
	public void run() {
		
		int lv = 0;
		
		while(lv < 3) {
			System.out.println(getName() + " Local Var :" + ++lv);
			System.out.println(getName() + " Instance Var :" + ++iv);
			System.out.println();
		}
	}
}

public class Exam12_23 {

	public static void main(String args[]) {
		
		Thread23 th1 = new Thread23();
		Thread23 th2 = new Thread23();
		
		th1.start();
		th2.start();
		
	}
}
