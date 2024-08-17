package demo;

import java.util.HashSet;

public class Student {
	
	public static void main(String[] args) {
		
		HashSet s1 = new HashSet();
		s1.add("Java");
		s1.add(1234);
		s1.add("Selenium");
		s1.add(88.9f);
		s1.add("Selenium");
		System.out.println(s1);
	}
	
}
