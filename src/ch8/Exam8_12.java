package ch8;

public class Exam8_12 {

	public static void main(String args[]) {
		
		Exam8_12.method1();
		System.out.println("method1()의 수행을 마치고 main 메소드로 돌아왔습니다");
	}
	
	static void method1() {
		
		try {
			System.out.println("method1이 호출되었습니다");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally 블럭이 호출되었습니다");
		}
	}
}
