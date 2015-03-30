package ch11;

import java.util.*;

public class Exam11_38 {

	public static void main(String[] args) {
		
		Properties sysProp = System.getProperties();
		System.out.println("java version :" + sysProp.getProperty("java.version"));
		System.out.println("user.language :" + sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}
}
