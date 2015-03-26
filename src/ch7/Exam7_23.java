package ch7;

class Unit {
	int currentHP;
	int x;
	int y;
}

class Fighter extends Unit implements Fightable {
	
	public void move (int x, int y) {
		
	}
	
	public void attack(Unit u){
		
	}
}

interface Fightable extends Movable, Attackable { }

interface Movable {
	void move (int x, int y); 	
}

interface Attackable {
	void attack(Unit u); 
	
}
public class Exam7_23 {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f�� Unit Ŭ������ �ڼ��Դϴ�");
		}
		
		if (f instanceof Fightable) {
			System.out.println("f�� Fightable �������̽��� �����߽��ϴ�");
		}
		
		if (f instanceof Movable ) {
			System.out.println("f�� movable �������̽��� �����߽��ϴ�");
		}
		
		if (f instanceof Attackable) {
			System.out.println("f�� Attackable �������̽��� �����Ͽ����ϴ�");
		}
		
		if (f instanceof Object) {
			System.out.println("f�� Object Ŭ������ �ڼ��Դϴ�");
		}
	}
}
