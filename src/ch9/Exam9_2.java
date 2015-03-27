package ch9;

class Person {
	long id;
	
	public boolean eqauls(Object obj) {
		
		if (obj != null && obj instanceof Person){
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
	
	Person (long id) {
		this.id = id;
	}
	
}
public class Exam9_2 {

	public static void main(String[] args) {
		
		Person p1 = new Person(80110811112222L);
		Person p2 = new Person(80110811112222L);
	
		if (p1 == p2) {
			System.out.println("p1�� p2�� ���� ����Դϴ�");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");
		}
		
		if (p1.eqauls(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");
		}
	
	}
}

