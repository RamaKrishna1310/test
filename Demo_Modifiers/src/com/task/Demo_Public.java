package com.task;

public class Demo_Public {
	public int a=10;
	public void displayInfo()
	{
		System.out.println("The Value of a is" +a);
	}
	public static void main(String [] args)
	{
		Demo_Public d= new Demo_Public();
		d.displayInfo();
	}

}
