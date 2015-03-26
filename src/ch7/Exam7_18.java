package ch7;

class Parent4 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child4 extends Parent4 {}
public class Exam7_18 {
	
	public static void main(String[] args) {
		
		Parent4 p = new Child4();
		Child4 c = new Child4();
		
		System.out.println("p.x= " + p.x);
		p.method();
		
		System.out.println("c.x= " + c.x);
		c.method();
		
	}

}
