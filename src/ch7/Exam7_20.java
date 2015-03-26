package ch7;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv3 extends Product {
	
	Tv3() {
		super(100);
	}
	
	public String toString() {
		return "TV";
	}
}	
	
class Computer extends Product {
	
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
	
}

class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p +"�� �����Ͽ����ϴ�");
	}
}

public class Exam7_20 {
	
	public static void main(String args[]) {
		
		Buyer b = new Buyer();
		Tv3 tv = new Tv3();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�");
		System.out.println("���� ���ʽ�������" + b.bonusPoint + "�Դϴ�");
	}
	

}
