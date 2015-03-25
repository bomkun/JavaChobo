package ch2;

public class Exam2_5 {

	public static void main(String[] args) {
		
		byte b = 0;
		int i = 0;
		
		
		for (int x=0; x<=270; x++) {
			System.out.print(b++);		// print는 출력 후 개행을 안함 
			System.out.print('\t');		//tab 출력
			System.out.println(i++);
		}
	}
}
