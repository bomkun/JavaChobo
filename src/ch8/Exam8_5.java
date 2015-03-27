package ch8;

public class Exam8_5 {

	public static void main(String[] args) {
		
		try {
			
			throw new Exception();
			
		} catch(Exception e) {
			System.out.println("exception이 발생하였습니다");
		}
	}
}
