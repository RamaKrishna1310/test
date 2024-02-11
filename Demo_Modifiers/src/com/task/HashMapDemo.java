package com.task;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(100,"Rama");
		m.put(102,"Krishna");
		System.out.println(m);
		System.out.println(m.hashCode());
		System.out.println(m.get(102));
		//System.out.println(m.remove(100));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
	}//Map interface sort the data using the keyvalues and doesn't accept duplicate values

}
