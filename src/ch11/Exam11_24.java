package ch11;

import java.util.*;

public class Exam11_24 {

	public static void main(String args[]) {
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setAdd = new HashSet();
		HashSet setSub = new HashSet();
		HashSet setCom = new HashSet();
		
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B =" + setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if (setA.contains(tmp))
				setCom.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setSub.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			setAdd.add(it.next());
		}
		
		it = setB.iterator();
		while(it.hasNext())
			setAdd.add(it.next());
	
		System.out.println("A ¡û B =" + setCom );
		System.out.println("A ¡ú B  =" + setAdd);
		System.out.println("A - B =" + setSub);
		
		
 	}
}
