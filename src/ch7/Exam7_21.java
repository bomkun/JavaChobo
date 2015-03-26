package ch7;

class Product2 {
	
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv4 extends Product2 {
	
	Tv4() {
		super(100);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer2 extends Product2 {
	
	Computer2() {
		super(200);
	}
	
	public String toString() {
		
		return "Computer";
	}
}

class Audio extends Product2 {
	
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "audio";
	}
	
}

class Buyer2 {
	
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10];
	int i = 0;


	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "�� �����Ͽ����ϴ�");
	}


	void summary() {
		
		int sum = 0;
		String itemList = "";
		
		for (int i=0; i<item.length; i++) {
			if (item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + " ,";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "���� �Դϴ�");
		System.out.println("�����Ͻ� ��ǰ��" + itemList +" �Դϴ�");
	}
	

}


public class Exam7_21 {

	public static void main(String args[]) {
		Buyer2 b = new Buyer2();
		Tv4 tv = new Tv4();
		Computer2 com = new Computer2();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
	}
}
