package ch11;

import java.util.*;

public class Exam11_46 {

	public static void main(String[] args) {
		
		String date1 = "200508";
		String date2 = "200405";
		
		int month1 = Integer.parseInt(date1.substring(0,4)) * 12 + Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0,4)) * 12 + Integer.parseInt(date2.substring(4));
		
		System.out.println(date1 +"과" + date2 +"의 차이는" + Math.abs(month1 - month2) +"개월 입니다" ) ;
	}
}
