package ch6;

class Document {
	static int count = 0;
	String name;
	
	public Document() {
		this("���� ����" + ++count);
	}
	
	public Document(String name) {
		this.name = name;
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�");
	}
}
public class Exam6_25 {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		
	}
}
