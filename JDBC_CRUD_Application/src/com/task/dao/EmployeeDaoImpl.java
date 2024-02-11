package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao{
	public static PreparedStatement pst=null;
	public static Connection connection=null;
	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		connection=DBUtil.getDBConnection();
		pst =connection.prepareStatement("insert into emp values(?,?,?)");
		pst.setInt(1, empId);
		pst.setString(2, empName);
		pst.setString(3, empAddress);
		pst.executeUpdate();
		System.out.println("inserted One Record Successfully!!");
		pst.close();
		connection.close();
	}
	
	public void updateEmployee(int cid,EmployeeBean e) throws ClassNotFoundException, SQLException{
		String uname = e.getEmpname();
		String uadd = e.getEmpaddress();
		connection=DBUtil.getDBConnection();
		pst=connection.prepareStatement("update emp set empname = '"+uname+"',empaddress='"+uname+"' where empid="+cid);
		pst.executeUpdate();
		
		System.out.println("Record has been Updated Succesfully!!!!");
		pst.close();
		connection.close();
	}
	
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException{
		
		connection =DBUtil.getDBConnection();
		pst = connection.prepareStatement("delete from emp where empid="+did);
		pst.executeUpdate();
		System.out.println("Record has been Deleted Succesfully!!!!");
		pst.close();
		connection.close();
		
	}

	@Override
	public void getEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		connection =DBUtil.getDBConnection();
		pst = connection.prepareStatement("select * from emp");
		pst.executeUpdate();
		System.out.println("Record has been Retrived Succesfully!!!!");
		pst.close();
		connection.close();
		
		
	}

}

