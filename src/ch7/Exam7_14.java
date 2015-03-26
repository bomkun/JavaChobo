package ch7;

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive , brr");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}

public class Exam7_14 {

	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water();
		fe2= (FireEngine)car;
		fe2.water();
	}

}
