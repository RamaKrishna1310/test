package com.task.services;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.EmployeeDaoImpl;
import com.task.dao.IEmployeeDao;

public class EmployeeServiceImpl implements IEmployeeService{


	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		IEmployeeDao dao= new EmployeeDaoImpl();
		dao.insertEmployee(bean);
	}

	public void updateEmployee(int cid,EmployeeBean e) throws ClassNotFoundException, SQLException{
		IEmployeeDao dao= new EmployeeDaoImpl();
		dao.updateEmployee(cid,e);
	}

	@Override
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		IEmployeeDao dao= new EmployeeDaoImpl();
		dao.deleteEmployee(did);
		
	}

	@Override
	public void getEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		IEmployeeDao dao= new EmployeeDaoImpl();
		dao.getEmployees();
		
	}

}
