package ch9;

public class Exam9_12 {

	public static void main(String[] args) {
		
		String[] words = {new String("aaa"), new String("bbb"), new String("ccc") };
	
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("ccc")) {
				System.out.println("words���� equals �޼ҵ带 ã�ҽ��ϴ�");
			}
			
			if (words[i] == "ccc") {
				System.out.println("words���� == �����ڷ� ã�ҽ��ϴ�");
			}
		}
		
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].intern();
		}
		
		System.out.println("<<String �迭 words�� ���ڿ��� intern �޼ҵ带  ������ �� >>");
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("ccc")) {
				System.out.println("words���� equals �޼ҵ带 ã�ҽ��ϴ�");
			} 
			if (words[i] == "ccc") {
				System.out.println("words���� == �����ڷ� ã�ҽ��ϴ�");
			}
		}
		
	}
}
