package ch11;
import java.util.*;

public class Exam11_8 {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		
		System.out.println("=stack=");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("=queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
			
		}
	}
}
