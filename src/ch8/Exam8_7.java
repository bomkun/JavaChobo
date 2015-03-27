package ch8;

public class Exam8_7 {

	public static void main(String args[]) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			if (ae instanceof ArithmeticException) 
				System.out.println("true");
				System.out.println("Arithmetic Exception");
		} catch (Exception e) {
				System.out.println("Exception");
		}
		System.out.println(6);
	}
}
