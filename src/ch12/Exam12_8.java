package ch12;

import javax.swing.JOptionPane;

class Thread8_1 extends Thread {

	public void run() {

		System.out.println("10�ʾȿ� ���� �Է��ؾ� �մϴ�");
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		Exam12_8.inputCheck = true;
		System.out.println("�Է°��� " + input + "�Դϴ�");

	}
}

class Thread8_2 extends Thread {

	public void run() {

		for (int i = 9; i > 0; i--) {
			if (Exam12_8.inputCheck)
				return;
			System.out.println(i);

			try {
				sleep(1000);
			} catch (InterruptedException e) {

			}
	
			
		}
		
		System.out.println("10�ʵ��� ���� �Էµ��� �ʾ� �����մϴ�");
		System.exit(0);
	}

}

public class Exam12_8 {

	static boolean inputCheck = false;

	public static void main(String[] args) throws Exception  {

		Thread8_1 th1 = new Thread8_1();
		Thread8_2 th2 = new Thread8_2();
		
		th1.start();
		th2.start();
	}

}
