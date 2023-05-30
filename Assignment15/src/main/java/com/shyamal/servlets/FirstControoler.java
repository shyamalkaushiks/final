package com.shyamal.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstControoler
 */
@WebServlet(
		name = "FirstControler", 
		urlPatterns = { "/FirstControler" }, 
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:mysql:///shyamal"), 
				@WebInitParam(name = "username", value = "root"), 
				@WebInitParam(name = "password", value = "password")
		})
public class FirstControoler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	Connection connection = null;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded succesufully....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	
 
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
		
		  String url=getInitParameter("url");
		 String username= getInitParameter("username");
		 String password= getInitParameter("password");
		  try {
			connection=DriverManager.getConnection(url,username,password);
			 if(connection!=null)
			 {
				 System.out.print("connection is estalished");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h1>Request type is :: " + request.getMethod() + "</h1>");

		Statement statement=null;
		ResultSet resultSet=null;
		  
		try {
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select sid,sname,sage,saddress from student");
			while(resultSet.next())
			{
				int sid = resultSet.getInt("sid");
				String sname = resultSet.getString("sname");
				int sage = resultSet.getInt("sage");
				String saddress = resultSet.getString("saddress");
				out.println("<html><head></head>");
				out.println("<body>");
				out.println("the value is"+sid+"<br/>\n"+"sname"+sname+"sage"+sage+"saddress"+saddress);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
