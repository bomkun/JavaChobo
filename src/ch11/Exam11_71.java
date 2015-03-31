package ch11;

import java.util.*;
import java.text.*;

public class Exam11_71 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 2,31);
		
		Date day = cal.getTime();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd Eø‰¿œ");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));
	}
}
