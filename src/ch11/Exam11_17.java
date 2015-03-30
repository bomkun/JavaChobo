package ch11;

import java.util.*;
public class Exam11_17 {

	public static void main(String args[]) {
		
		Exam11_16 v = new Exam11_16();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		System.out.println("삭제 전 : " + v);
		Iterator it = v.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
	
		System.out.println("삭제 후: " + v);
	}
}
