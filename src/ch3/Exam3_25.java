package ch3;

public class Exam3_25 {

	public static void main(String[] args) {
		
		char x = 'j';
		
		if ((x>='a' && x <='z') || (x>='A' && x<='Z')) {
			System.out.println("유효한 문자");
		} else {
			System.out.println("유효하지 않은 문자");
		}
	}
}
