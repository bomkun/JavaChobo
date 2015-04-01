package ch12;

public class Exam12_4 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		
		System.out.println("소요시간 1: " + (System.currentTimeMillis() - startTime));
		
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.println("소요 시간 2:" + (System.currentTimeMillis() - startTime));
	}
}
