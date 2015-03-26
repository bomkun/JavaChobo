package ch7;


class Point1 {
	int x;
	int y;
	
	Point1(int x, int y) {
		
		this.x = x;
		this.y = y;

	}		
	String getLocation() {
		return "x : " + x + ", y ;" + y;
	}
}

class Point3D extends Point1 {
	
	int z;
	
	Point3D(int x, int y, int z) {

		super(x,y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}


public class Exam7_7 {
	
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1, 2, 3);
	}

}
