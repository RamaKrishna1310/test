package com.task;
import java.util.*;
public class TreeSet {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Set s =new java.util.TreeSet();
		s.add(20);
		s.add(90);
		s.add(87);
		System.out.println(s);//treeSet will sort the numbers in the ascending order
		java.util.TreeSet<String> t = new java.util.TreeSet<String>();
		t.add("Rama");
		t.add("Krishna");
		t.add("Bhairava");
		System.out.println(t);// Even in the String type the alphabets will be Sorted in order
	}

}
