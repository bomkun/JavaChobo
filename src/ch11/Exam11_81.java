package ch11;

import java.util.*;

class Student3 {
	String name = "";
	int ban;
	int no;
	
	Student3(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}

public class Exam11_81 {

	public static void main(String[] args) {
		
		ArrayList<Student3> list = new ArrayList<Student3>();
		list.add(new Student3("�ڹٿ�",1,1));
		list.add(new Student3("�ڹ�Ȳ",1,2));
		list.add(new Student3("�ڹٱ�",2,1));
		list.add(new Student3("�ڹٹ�",2,2));
		
		Iterator<Student3> it = list.iterator();
		
		while(it.hasNext()) {
			Student3 s = it.next();
			System.out.println(s.name);
		}
	}
}
