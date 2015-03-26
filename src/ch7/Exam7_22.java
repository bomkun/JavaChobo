package ch7;

import java.util.*;

class Product3 {
	int price;
	int bonusPoint;
	
	Product3 (int price) { 
		this.price = price;
		bonusPoint = (int)(price/10.0);
		
	}

	Product3() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv5 extends Product3 {
	
	Tv5() {
		super(100);
	}
	public String toString() {
		return "TV";
	}
}

class Computer3 extends Product3 {
	
	Computer3() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product3 {
	
	Audio2() {
		super(50);
	}
	
	public String toString() {
		return "audio";
	}
}

class Buyer3 { 
	int money = 1000;
	int bonusPoint = 0;
	
	Vector item = new Vector();
	
	void buy(Product3 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p +"�� �����Ͽ����ϴ�");
	}
	
	void refund(Product3 p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p +"�� ��ȯ�Ͽ����ϴ�");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if (item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�");
			return;
		}
		
		for (int i =0; i< item.size(); i++) {
			Product3 p = (Product3)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : "," + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�");
	}
	
}
public class Exam7_22 {

	public static void main(String args[]) {
		
		Buyer3 b = new Buyer3();
		Tv5 tv = new Tv5();
		Computer3 com = new Computer3();
		Audio2 audio = new Audio2();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
		
	}
	
}
