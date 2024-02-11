package com.task;
import java.util.*;
public class HashSetDemo {
 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Set s =new HashSet();
		s.add(10);
		s.add(20);
		s.add("Rama");
		s.add(null);
		s.add(20);
		System.out.println(s);
		
	}
}
