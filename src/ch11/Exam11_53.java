package ch11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Exam11_53 {

	public static Properties prop = new Properties();
	public static String fileName = "data.txt";
	
	public static void main(String[] arg) {
		
		String[] data = readData();
		
		HashMap map = new HashMap();
		
		for (int i=0; i < 100; i++) {
			String temp = getRandArr(data);
			if (map.containsKey(temp)) {
				Integer value = (Integer)map.get(temp);
				map.put(temp, new Integer(value.intValue()+1));
				
			} else {
				
				map.put(temp, new Integer(1));
			}
		}
		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();
			Integer value = (Integer)map.get(key);
			int intValue = value.intValue();
			System.out.println(key + ":" + printGraph('#', intValue) + intValue) ;
		}
		
	}
	
	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];
		
		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}
	
	public static String getRandArr(String[] arr) {
		
		return arr[getRand(arr.length-1)];
	}
	
	public static int getRand(int n) {
		return getRand(0,n);
	}
	
	public static int getRand(int from, int to) {
		return (int)(Math.random() * Math.abs(to-from)+1) + Math.min(from,to);
	}
	
	public static String[] readData() {
		
		try {
			prop.load(new FileInputStream(fileName));
		} catch (IOException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다");
			System.exit(0);
		}
		
		Enumeration e = prop.propertyNames();
		
		int sum = 0;
		
		while (e.hasMoreElements()) {
			String element = (String)e.nextElement();
			int value = Integer.parseInt(prop.getProperty(element));
			sum += value;
			System.out.println(element + "=" + value);
		}
		
		String[] data = new String[sum];
		
		int i = 0;
		e = prop.propertyNames();
		
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			int value = Integer.parseInt(prop.getProperty(element));
			
			for (int x=0; x < value; x++, i++) {
				data[i] = element;
			}
		}
		
		return data;
	}

}
