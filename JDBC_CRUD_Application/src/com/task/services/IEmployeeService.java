package com.task.services;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeService {
	
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
	public void updateEmployee(int cid,EmployeeBean e) throws ClassNotFoundException, SQLException;
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException;
	public void getEmployees() throws ClassNotFoundException, SQLException;


}
