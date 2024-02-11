package com.task;
import java.util.*;

class Employee implements Comparable<Employee>{
	String name;
	Employee(String name){
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.name);
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	

}
public class Employee1{
	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
	a.add(new Employee("Rama"));
	a.add(new Employee("Krishna"));
	a.add(new Employee("Bhairava"));
	Collections.sort(a);
	for(Employee e:a) {
	System.out.println(e);
	}
	
}
}
