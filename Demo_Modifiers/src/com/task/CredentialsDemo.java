package com.task;

import java.util.Scanner;

class InvalidCredentialsException extends Throwable
{
	InvalidCredentialsException()
	{
		System.out.println("Please enter  the Credentials Correctly ");
	}
}
public class CredentialsDemo {
	public static void main(String[] args) throws InvalidCredentialsException {
		String userName,passWord;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username : ");
		userName = s.next();
		System.out.println("Enter the Password : ");
		passWord = s.next();
		
		if(userName.equals("rama")  && passWord.equals("admin")) {
			System.out.println("Login Success");
		}
		else {
			throw new InvalidCredentialsException();
		}
	}

}
