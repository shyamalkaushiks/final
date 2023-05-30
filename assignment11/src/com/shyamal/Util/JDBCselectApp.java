package com.shyamal.Util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCselectApp {
   public static void main(String[] args)
   {
	   Connection connection=null;
	   Statement statement=null;
	   ResultSet resultSet=null;
	   String sqlSelectQuery = "select sid,sname,sage,saddress from student";
	     try {
			connection=JdbcUtil.getJdbcConnection();
			  if(connection!=null)
			  {
				  statement =connection.createStatement();
				  resultSet=statement.executeQuery(sqlSelectQuery);
			  }
			  while (resultSet.next()) {
					int sid = resultSet.getInt("sid");
					String sname = resultSet.getString("sname");
					int sage = resultSet.getInt("sage");
					String saddress = resultSet.getString("saddress");
					System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + saddress);
				}
			
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
   }
}
