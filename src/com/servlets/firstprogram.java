package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class firstprogram implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method called ");
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method called ");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method called ");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("WElcome to the servlet");
		out.println("Today is "+new Date().toString());

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("ServletCOnfig method called ");
        
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServeltInfo method called ");

		return null;
	}

}
