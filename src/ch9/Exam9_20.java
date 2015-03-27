package ch9;

public class Exam9_20 {

	private String source = "";
	private int length;
	private StringBuffer buffer;
	
	public Exam9_20 (String source) {
		this.source = source;
		length = source.length();
		buffer = new StringBuffer(length + 100);
	}
	
	public int length() {
		return length;
	}
	
	public String replace(String old, String nw) {
		return replace(old,nw,0);
	}
	
	public String replace(String old, String nw, int pos) {
		
		int index = 0;
		
		if(old == null || nw == null) 
			return "null";
		
		if( (index = source.indexOf(old, pos)) != -1) {
			buffer.append(source.substring(pos, index));
			buffer.append(nw);
			
			replace(old, nw, index + old.length());
			
		} else { 
			buffer.append(source.substring(pos));
		}
		
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		
		String str ="001111111112111414141";
		System.out.println(str);
		Exam9_20 sr = new Exam9_20(str);
		System.out.println(sr.replace("111","AAA"));
		
	}
}
