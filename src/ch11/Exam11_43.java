package ch11;

import java.util.*;

public class Exam11_43 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		
		date.set(2005, 7,31);
		System.out.println();
		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "³â" + (date.get(Calendar.MONTH)+1) + "¿ù" + date.get(Calendar.DATE) + "ÀÏ";
	}
}
