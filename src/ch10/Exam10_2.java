package ch10;

public class Exam10_2 {

	class InstanceInner {
		
	}
	
	static class StaticInner {
		
	}
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	
	static void staticMethod() {
		
		//sttic 멤버는 인스턴스 멤버에 접근할 수 없다 
	
	    //InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다
		
		Exam10_2 outer = new Exam10_2();
		InstanceInner obj1 = outer.new InstanceInner();
		
	}
	
	void instanceMethod() {
		
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다
		
		//LocalInner lv = new LocalInner();
		
	}
	
	void myMethod() {
		class LocalInner {
			
		}
		LocalInner lv = new LocalInner();
	}
	
}
