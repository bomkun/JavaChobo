package ch8;

public class Exam8_4 {

	public static void main(String[] args) {
		
		try {
			throw new Exception("���Ƿ� �߻�������");
		} catch (Exception e) {
			
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����");
	}
}
