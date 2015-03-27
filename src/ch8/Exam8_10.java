package ch8;

import java.io.*;
import java.util.*;

public class Exam8_10 {

	public static void main(String args[]) {
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("error.log",true);
			ps = new PrintStream(fos);
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		} catch (Exception ae) {
			
			System.err.println("---------------------------");
			System.err.println("예외발생시간 : " + new Date());
			System.err.println(System.err);
			System.err.println("예외 메시지: " + ae.getMessage());
			System.err.println("----------------------------");
		}
		
		System.out.println(6);
	}
	
}
