package ch12;

public class Exam12_10 {

	public static void main(String[] args) {
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "subGrp1");
		
		grp1.setMaxPriority(3);
		
		Thread th1 = new Thread(grp1,"th1");
		Thread th2 = new Thread(subGrp1, "th2");
		Thread th3 = new Thread(grp2, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(">>List of ThreadGroup :" + main.getName() + ", Ative ThreadGroup :"+ main.activeGroupCount() + ", Active Thread :" + main.activeCount());
		
		main.list();
	}
}
