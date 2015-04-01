package ch12;

class MyThreadEx2 extends Thread {
	
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
public class Exam12_2 {

	public static void main(String[] args) {
		
		MyThreadEx2 t1 = new MyThreadEx2();
		t1.start();
	
	}
	
}
