package ch10;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam10_8 {

	public static void main(String[] args) {
		
		Button b = new Button("start");
		b.addActionListener(new ActionListener( ) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Action occurred!");
			}
		});
	}
}
