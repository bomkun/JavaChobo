package ch11;

import java.util.*;

public class Exam11_9 extends Vector {


	//statck에 객체를 저장한다
	
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	//stack 맨위에 저장된 객체를 꺼낸다 
	
	public Object pop() {
		
		Object obj = peek();
		removeElementAt(size() -1);
		return obj;
	}

	public Object peek() {

		int len = size();
		
		if (len == 0)
			throw new EmptyStackException();
		return elementAt(len - 1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		
		int i = lastIndexOf(o);
		
		if (i >= 0) {
			return size() - i;
		}
		
		return i;
	}
}
