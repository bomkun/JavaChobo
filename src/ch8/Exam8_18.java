package ch8;

public class Exam8_18 {

	public static void main(String[] args)  {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main �޼��忡�� ����ó�� ");
		}
	}
	
	static void method1() throws Exception  {
		
		try {
			throw new Exception("method���� ����");
		} catch (Exception e) {
			System.out.println("method1 �޼��忡�� ");
			
			throw e;
		}
	}
	
}
