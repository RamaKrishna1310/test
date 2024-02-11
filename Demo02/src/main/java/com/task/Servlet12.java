package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet12 extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	PrintWriter pw=response.getWriter();
response.setContentType("text/html");
pw.println("Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
}
}