package ch10;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occcurred !");
	}
}
public class Exam10_7 {

	public static void main(String[] args) {
		
		Button b = new Button("start");
		b.addActionListener(new EventHandler());
		
	}
}


