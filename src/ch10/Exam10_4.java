package ch10;

class Outer {
	
	class IntanceInner {
		
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
		
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
	
}

public class Exam10_4 {

	public static void main(String[] args) {
		
		Outer oc = new Outer();
		Outer.IntanceInner ii = oc.new IntanceInner();
		
		
		System.out.println("ii.iv :" + ii.iv);
		System.out.println("Outer.StaticInner.cv :" + Outer.StaticInner.cv);
		
		
		//스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
	} 

}
