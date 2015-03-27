package ch8;

public class Exam8_18 {

	public static void main(String[] args)  {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메서드에서 예외처리 ");
		}
	}
	
	static void method1() throws Exception  {
		
		try {
			throw new Exception("method에서 에러");
		} catch (Exception e) {
			System.out.println("method1 메서드에서 ");
			
			throw e;
		}
	}
	
}
