package ch10;

public class Exam10_2 {

	class InstanceInner {
		
	}
	
	static class StaticInner {
		
	}
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	
	static void staticMethod() {
		
		//sttic ����� �ν��Ͻ� ����� ������ �� ���� 
	
	    //InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//�ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� ������ �� �ִ�
		
		Exam10_2 outer = new Exam10_2();
		InstanceInner obj1 = outer.new InstanceInner();
		
	}
	
	void instanceMethod() {
		
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//�޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ �� ����
		
		//LocalInner lv = new LocalInner();
		
	}
	
	void myMethod() {
		class LocalInner {
			
		}
		LocalInner lv = new LocalInner();
	}
	
}
