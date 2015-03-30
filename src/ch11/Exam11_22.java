package ch11;

import java.util.*;

class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}

public class Exam11_22 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("david",10));
		set.add(new Person("david",10));
		
		System.out.println(set);
	}
}
