package com.servlets;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
//@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Firstname = request.getParameter("Firstname");
		String Lastname = request.getParameter("Lastname");
		String Email = request.getParameter("Email");
		String Password = request.getParameter("Password");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");	
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?)");
			ps.setString(1, Firstname);
			ps.setString(2, Lastname);
			ps.setString(3, Email);
			ps.setString(4, Password);
			
			int i = ps.executeUpdate();
			
			if(i>0) {
				out.print("You are succesfully Registered");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
