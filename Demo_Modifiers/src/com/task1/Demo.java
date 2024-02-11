package com.task1;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Employee e1=new Employee("RamaKrishna","hyderabad");
		Employee e2=new Employee("Rohit","secunderabad");
		Employee e3=new Employee("LakshmiKanth","masab tank");
		System.out.println("This is the CRUD Application");
		System.out.println("1. Read Employee ");
		System.out.println("2. Read multiple Employees");
		System.out.println("3. Delete a Employee data");
		System.out.println("4. Update a employee data ");
		System.out.println("5  Insert a Employee Data");
		System.out.println("\n");
		System.out.println("Please select your option : ");
		Map<Integer, Employee> m=new HashMap<Integer, Employee>();
		m.put(101, e1);
		m.put(102, e2);
		m.put(103, e3);
		Scanner sc=new Scanner(System.in);		
	int option=sc.nextInt();
	switch(option) {
	case 1:{
		System.out.println("your selected is to read Employee record");
		System.out.println("select Employee Record like 101 or 102 or 103");
		int getId=sc.nextInt();
		Employee read=m.get(getId);
		System.out.println(read);
		
		break;
	}
	case 2:{
		System.out.println("You Selected to Read Multiple Record");
		System.out.println("Your are Fetching multiple Records");
		Set set=m.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		break;
	}
	case 3:
	{
		System.out.println("your are selected to Delete a record");
		System.err.println("Select a record which your willing to delete");
		int getId=sc.nextInt();
		System.out.println("Record Deleted Successfully");
		break;
	}
	case 4:{
		System.out.println("You choose to update employee record");
		System.out.println("Select the which you are willing to update");
		int getId=sc.nextInt();
		System.out.println("Insert Employee name");
		Employee update=m.get(getId);
		System.out.println(update.getEmpName()+" "+update.getEmpAddress());
		update.setEmpAddress("Punjab");
		System.out.println("after updating the Employee record");
		System.out.println(update.getEmpName()+" "+update.getEmpAddress());
		break;
	}
	case 5:{
		System.out.println("you selected to insert the Employee record");
		System.out.println("Insert the Employee record");
		int key=sc.nextInt();
		System.out.println("Insert Employee name : ");
		String empName = sc.next();
		System.out.println("\n");
		System.out.println("Insert Employee address : ");
		String empAddress = sc.next();
		Employee e = new Employee(empName,empAddress);
		m.put(key, e);
		System.out.println("After Inserting Employee Record");
		Set set = m.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
  
		break;
	}
	default:{
		System.out.println("Entered option is not exist ");
	}
	
	}
		
	}

}