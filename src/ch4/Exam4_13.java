package ch4;

public class Exam4_13 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			sum += i;
		}

		// for문을 벗어난 곳에서 i를 사용했기 때문에 에러 발생
		//		System.out.println(i -1 + "까지의 합 :" + sum);  
		
	}
}
