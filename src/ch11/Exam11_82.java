package ch11;

import java.util.*;

class Student4  implements Comparable<Student4> {
	
	String name="";
	int ban = 0;
	int no = 0;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	
	int total = 0;
	
	Student4(String name, int ban, int no, int koreanScore, int mathScore, int englishScore) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		
		total = koreanScore + mathScore + englishScore;
	}
	
	public String toString() {
		return name + "\t"
			+ ban + "\t"
			+ no + "\t"
			+ koreanScore + "\t"
			+ mathScore + "\t"
			+ englishScore + "\t"
			+ total +"\t";
	}
	
	public int compareTo(Student4 o) {
		return o.total - this.total;
	}
}
public class Exam11_82 {

	public static void main(String[] args) {
		
		ArrayList<Student4> list = new ArrayList<Student4>();
		list.add(new Student4("자바왕",1,1,100,100,100));
		list.add(new Student4("자바황",1,2,100,50,60));
		list.add(new Student4("자바광",2,1,100,100,50));
		list.add(new Student4("자바방",2,2,100,100,30));
		
		Collections.sort(list);
		
		Iterator<Student4> it = list.iterator();
		
		while(it.hasNext()) {
			Student4 s = it.next();
			System.out.println(s);
		}
		
	}
}
