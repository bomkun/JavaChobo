package ch6;

class Product {
	static int count = 0;
	int serialNo;
	
	//인스턴스 초기화 블럭
	{					
		++count;
		serialNo = count;
	}
	
	//기본 생성자
	
	public Product() {}  
	
}

public class Exam6_24 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품 번호(serial no)는  " + p1.serialNo );
		System.out.println("p2의 제품 번호(serial no)는  " + p2.serialNo );
		System.out.println("p3의 제품 번호(serial no)는  " + p3.serialNo );
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다 ");
	}
}
