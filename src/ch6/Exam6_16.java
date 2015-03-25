package ch6;

public class Exam6_16 {

	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	//static int cv2 = iv;
	static int cv2 = new Exam6_16().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
		Exam6_16 c = new Exam6_16();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		Exam6_16 c = new Exam6_16();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
