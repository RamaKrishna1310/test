package com.task;
import java.util.*;
public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<String> s = new ArrayList<String>();
	s.add("Rama");
	s.add("Rohit");
	s.add("Lakshmi");
	Collections.sort(s);//in iterator values will be in input order by using this method we can arrange the strings in alphabetical order..
	Iterator<String> itr = s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+" ");
	}
}
}
