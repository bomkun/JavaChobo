package ch11;

import java.util.*;

public class Exam11_58 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		do {
			System.out.print("���ϴ� ���� �Է��ϼ��� ��ġ���� Q�� �Է� ->");
			input = scan.nextLine();
			System.out.println("�Է��Ͻ� ����" + input+ "�Դϴ�");
		} while(!input.equalsIgnoreCase("Q"));
		
		System.out.println("���α׷��� �����մϴ�");
	}
}
