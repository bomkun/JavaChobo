package ch6;

class MyMath2 {
	long a,b ;
	
	long add() {return a + b;}
	long sub() {return a - b;}
	long multi() {return a * b;}
	double div() {return a /b;}

	static long add(long a, long b) { return a + b;}
	static long sub(long a, long b) { return a - b;}
	static long multi(long a, long b) { return a * b;}
	static double div(double a, double b) {return a / b;}
	
	}

public class Exam6_15 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.sub(200L, 100L));
		System.out.println(MyMath2.multi(200L, 100L));
		System.out.println(MyMath2.div(200.0, 100.0));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.multi());
		System.out.println(mm.div());
	}
}
