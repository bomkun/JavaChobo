
package ch12;

import javax.swing.JOptionPane;

class Thread7 extends Thread {
	
	
	public void run() {
		
		for (int i = 10; i  > 0 ; i--) {
			System.out.println(i);
		}
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
	}
}
public class Exam12_7 {

	public static void main(String[] args) {
		
		Thread7 th1 = new Thread7();
		th1.start();
		
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은" + input + "입니다");
		
	}
	
}
