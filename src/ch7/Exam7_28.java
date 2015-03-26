package ch7;

interface I2 {
	public abstract void methodB();
}

class A2 {
	void methodA() {
		I2 i = InstanceManager.getInstance();
		i.methodB();
	}
}

class B2 implements I2 {

	public void methodB() {
		System.out.println("method B in class");
	}
}


class InstanceManager {
	public static I2 getInstance() {
		return new B2();
	}
}
public class Exam7_28 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.methodA();
	}
}
