package ch8;

public class Exam8_14 {

	public static void main(String args[] ){
		method1();
	}
	
	static void method1() {
		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 �޼ҵ忡�� ���ܰ� ó���Ǿ����ϴ�");
			e.printStackTrace();
		}
	}
}
