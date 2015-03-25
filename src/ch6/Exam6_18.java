package ch6;

class Data1 {
	int value;
}

class Data3 {
	int value;
	
	Data3(int x) {
	
		value = x;
	}
	
	Data3() {}
	
}

public class Exam6_18 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data3 d3 = new Data3();
	}
}
