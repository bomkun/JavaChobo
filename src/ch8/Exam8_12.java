package ch8;

public class Exam8_12 {

	public static void main(String args[]) {
		
		Exam8_12.method1();
		System.out.println("method1()�� ������ ��ġ�� main �޼ҵ�� ���ƿԽ��ϴ�");
	}
	
	static void method1() {
		
		try {
			System.out.println("method1�� ȣ��Ǿ����ϴ�");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()�� finally ������ ȣ��Ǿ����ϴ�");
		}
	}
}