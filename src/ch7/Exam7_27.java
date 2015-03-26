package ch7;

interface I {
	public abstract void play();
}

class A1 {
	void autoPlay(I i) {
		i.play();
	}
}

class B1 implements I {
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I {
	public void play() {
		System.out.println("play in c class");
	}
}

public class Exam7_27 {

	public static void main(String args[]) {
		A1 a = new A1();
		a.autoPlay(new B1());
		a.autoPlay(new C());
	}
}
