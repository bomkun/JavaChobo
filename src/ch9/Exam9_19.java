package ch9;

public class Exam9_19 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		if (sb == sb2) {
			System.out.println("sb == sb2 ? true");
		} else {
			System.out.println("sb == sb2 ? false");
		}
		
		if (sb.equals(sb2)) {
			System.out.println("sb == sb2 ? true");
		} else {
			System.out.println("sb == sb2 ? false");
		}
		
		
		String s = sb.toString();
		String s2 = sb2.toString();
		
		if (s.equals(s2)) {
			System.out.println("s.eqauls(s2) ? true");
		} else {
			System.out.println("s.eqauls(s2) ? false");
		}
		
		
	}
}
