package ch4;

public class Exam4_4 {

	public static void main(String[] args) {
		
		int score = 45;
		char grade = ' ';
		
		grade = (score >=90) ? 'A' : ((score>=80) ? 'B' : 'C');
		
		System.out.println("����� ������" + grade +"�Դϴ�");
	}
}
