package ch12;

import java.util.*;

class Thread12_1 extends Thread {
	
	 Thread12_1(String name) {
		 super(name);
	}
	 
	 public void run() {
		 
		 try {
			 sleep(5 * 1000);
		 } catch (InterruptedException e) {
			 
		 }
	 }
}


class Thread12_2 extends Thread {
	
	Thread12_2(String name) {
		super(name);
	}
	
	public void run() {
		
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();
		
		int x = 0;
		
		while(it.hasNext()) {
			
			Object obj = it.next();
			Thread t = (Thread)obj;
			StackTraceElement[] ste = (StackTraceElement[])(map.get(obj));
			
			System.out.println("[" + ++x + "] name : " + t.getName() + ", group" + t.getThreadGroup().getName() + ", daemon :" + t.isDaemon());
			
			for (int i=0; i < ste.length; i++) {
				System.out.println(ste[i]);
			}
			
			System.out.println();
		}
	}
}

public class Exam12_12 {

	public static void main(String[] args) {
		
		Thread12_1 th1 = new Thread12_1("Tread1");
		Thread12_2 th2 = new Thread12_2("Thread2");
		
		th1.start();
		th2.start();
		
	}
}
