package ch9;

public class Exam9_17 {

	public static void main(String[] args) {
		
		String fullName ="Hello.java";
		
		int index = fullName.indexOf('.');
		
		String fileName = fullName.substring(0, index);
		
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName +"�� Ȯ���ڸ� ������ �̸��� :" + fileName);
		System.out.println(fullName +"�� Ȯ���ڴ� : " + ext);
		
	}
}