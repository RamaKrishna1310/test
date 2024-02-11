package com.task.dao;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DBUtil;

public interface IEmployeeDao {
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
	public void updateEmployee(int cid,EmployeeBean e) throws ClassNotFoundException, SQLException;
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException;
	public void getEmployees() throws ClassNotFoundException, SQLException;
	


}
