package ch11;

import java.util.*;

class Product{}
class Tv extends Product{ }
class Audio extends Product{ }

public class Exam11_80 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
		
		printAll2(productList);
		printAll2(tvList);
		
	}
	
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
	}
	
	public static void printAll2(ArrayList<? extends Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
	}
	
}
