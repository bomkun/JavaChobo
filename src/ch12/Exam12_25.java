package ch12;

class Account1 {
	int balance = 1000;
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			
			}
			balance -= money;
		}
	}
}

class RunnableEx2 implements Runnable {
	
	Account1 acc = new Account1();
	
	public void run() {
		
		while(acc.balance > 0) {
			int money = (int)(Math.random() * 3 +1) * 100;
			acc.withdraw(money);
			System.out.println("balance :" + acc.balance);
		}
	}
}

public class Exam12_25 {

	public static void main(String args[]) {
		

	Runnable r = new RunnableEx2();
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r);

	t1.start();
	t2.start();
	
	
	
	}
	
}
