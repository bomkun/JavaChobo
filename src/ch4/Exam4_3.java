package ch4;

public class Exam4_3 {

	public static void main(String[] args) {
		
		int score = 45;
		char grade = ' ';
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		System.out.println("당신의 학점은 " + grade + "입니다");
	}
}
