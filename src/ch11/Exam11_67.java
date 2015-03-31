package ch11;

import java.util.*;

public class Exam11_67 {

	public static void main(String[] args) {
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] +"|");
			System.out.println("개수 :" + result.length);
			
			 
			for (i = 0;st.hasMoreTokens();i++) {
				System.out.print(st.nextToken() + "|");
				
				System.out.println("개수 :" + i);
			}
		}
	}
}
