package ch11;

import java.util.*;

public class Exam11_58 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		do {
			System.out.print("원하는 값을 입력하세요 마치려면 Q를 입력 ->");
			input = scan.nextLine();
			System.out.println("입력하신 값은" + input+ "입니다");
		} while(!input.equalsIgnoreCase("Q"));
		
		System.out.println("프로그램을 종료합니다");
	}
}
