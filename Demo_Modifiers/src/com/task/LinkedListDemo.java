package com.task;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Integer> i = new LinkedList<Integer>();
		i.add(10);
		i.add(20);
		i.add(40);
		//Simple For Loop Concept Broo..
		for(int l=0;l<i.size();l++) {
		System.out.println(i);}
		//for each Loop
		for(Integer l1:i) {
			System.out.println(l1);
		}
		//for each method(lamda) java 1.8
		i.forEach((x)->System.out.println(x));
	}
}
