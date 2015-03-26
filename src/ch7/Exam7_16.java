package ch7;

class Car4 {}

class FireEngine2 extends Car4 {}
public class Exam7_16 {

	public static void main(String args[]) {
		FireEngine2 fe = new FireEngine2();
		
		if (fe instanceof FireEngine2) {
			System.out.println("this is a FireEngine2 instance");
		}
		
		if (fe instanceof Car4) {
			System.out.println("this is a car instance");
		}
		
		if (fe instanceof Object) {
			System.out.println("this is an Object instance");
		}
	}
}
