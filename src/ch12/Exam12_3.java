package ch12;

class MyThread3 extends Thread {
	
	public void run() {
		throwException();
	}
	
	public void throwException() {
		
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Exam12_3 {

	public static void main(String[] args) {
		
		MyThread3 t1 = new MyThread3();
		
		t1.run();
	}
}
