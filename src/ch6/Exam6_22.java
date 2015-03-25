package ch6;

public class Exam6_22 {

	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println(" { } ");
	}
	
	public Exam6_22() {
		System.out.println("»ý¼ºÀÚ");
	}
	
	public static void main(String[] args) {
		System.out.println("Exam6_22 ex = new Exam6_22() ");
		Exam6_22 ex = new Exam6_22();

		System.out.println("Exam6_22 ex2 = new Exam6_22() ");
		Exam6_22 ex2 = new Exam6_22();

	}
}
