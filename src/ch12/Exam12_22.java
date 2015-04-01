package ch12;

class Data {
	int iv = 0;
}
class Thread22 extends Thread {
	
	Data d;

	Thread22(Data d) {
		this.d = d;
	}
	
	public void run() {
		
		int lv = 0;
		
		while(lv <3) {
			System.out.println(getName() +" Local Var:" + ++lv);
			System.out.println(getName()+ " Instance Var :" + ++d.iv);
		}
	}
}


public class Exam12_22 {

	public static void main(String args[]) {
		
	Data d = new Data();
	Thread22 th1 = new Thread22(d);
	Thread22 th2 = new Thread22(d);
	
	th1.start();
	th2.start();
	
	
	}
}
