package com.task.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.task.bean.EmployeeBean;
import com.task.services.EmployeeServiceImpl;
import com.task.services.IEmployeeService;
import com.task.util.DBUtil;

public class Demo_CRUD {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Select Your Option");
	System.out.println("1. Insert employee data");
	System.out.println("2. Upadate employee data");
	System.out.println("3. Select employee data");
	System.out.println("4. Delete employee data");
	int option = sc.nextInt();
	switch(option) {
	case 1:{
		insertEmployee();
		break;
	}
	case 2:{
		updateEmployee();
		break;
	}
	case 3:{
		selectEmployees();
		break;
	}
	case 4 :{
		deleteEmployee();
		break;
	}
	default :
	{
		System.out.println("You entered the incorrect option");
		break;
	}
	}}
	private static void insertEmployee() throws ClassNotFoundException, SQLException {
		
	IEmployeeService service=new EmployeeServiceImpl();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Id");
	int id =sc.nextInt();
	System.out.println("Enter Your Name");
	String name=sc.next();
	System.out.println("Enter your Address");
	String address=sc.next();
	EmployeeBean bean = new EmployeeBean(id,name,address);
	service.insertEmployee(bean);
	
	
}

private static void deleteEmployee() throws ClassNotFoundException, SQLException{
	IEmployeeService service=new EmployeeServiceImpl();
	Scanner sd =new Scanner(System.in);
	System.out.println("Enter the empid you want to delete");
	int did = sd.nextInt();
	service.deleteEmployee(did);
	
}

private static void selectEmployees() throws ClassNotFoundException, SQLException {
	IEmployeeService service=new EmployeeServiceImpl();
	service.getEmployees();
}

private static void updateEmployee() throws ClassNotFoundException, SQLException {
	System.out.println("please enter the employee id you want to update..");
	Scanner sc = new Scanner(System.in);
	int cid = sc.nextInt();
	System.out.println("Enter new name");
	String uname=sc.next();
	System.out.println("Enter new address");
	String uadd=sc.next();
	EmployeeBean e= new EmployeeBean(cid,uname,uadd);
	IEmployeeService service=new EmployeeServiceImpl();
	service.updateEmployee(cid ,e);
	
	
}


}