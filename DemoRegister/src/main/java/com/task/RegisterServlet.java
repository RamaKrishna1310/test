package com.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
				PrintWriter pw=response.getWriter();
				response.setContentType("text/html");
		String userName=request.getParameter("username");
		String passWord=request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/task",
					"root","ramakrishna@9182");
			PreparedStatement pst=con.prepareStatement(
					"insert into register values(?,?) ");
			pst.setString(1, userName);
			pst.setString(2, passWord);
			pst.executeUpdate();
			pst.close();
			pw.println("Registration is success");
		}
		catch(Exception e) {
			System.out.println(e);		
		}

}
}