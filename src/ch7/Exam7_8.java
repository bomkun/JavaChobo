package ch7;

class Point2 {
	int x =10;
	int y = 20;
	
	Point2(int x, int  y) {
		
		this.x = x;
		this.y = y;
	}
}

class Point3DD extends Point2 {
	int z =30;
	
	Point3DD() {
		this(100,200,300);
	}
	
	Point3DD(int x, int y, int z) {
		super(x,y);
		this.z =z;
		
	}
}
public class Exam7_8 {

	public static void main(String args[]) {
		Point3DD p3 = new Point3DD();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}
