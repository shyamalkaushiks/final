package com.shyamal.Util;

import java.io.FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class JDBCselectApp {
   public static void main(String[] args)
   {
	   String url = "jdbc:postgresql://localhost:5432/mydatabase";
       String username = "username";
       String password = "password";
       
       // Input file path
       String filePath = "input.txt";
       
       try {
           // Load the PostgreSQL JDBC driver
           Class.forName("org.postgresql.Driver");
           
           // Establish the database connection
           Connection connection = DriverManager.getConnection(url, username, password);
           
           // Create a prepared statement with the SQL query
           String sql = "INSERT INTO mytable (column1, column2) VALUES (?, ?)";
           PreparedStatement statement = connection.prepareStatement(sql);
           
           // Read the input data from the file
           BufferedReader reader = new BufferedReader(new FileReader(filePath));
           String line;
           while ((line = reader.readLine()) != null) {
               String[] data = line.split(",");
               
               // Set the values for the prepared statement
               statement.setString(1, data[0]); // Assuming column1 is of type VARCHAR
               statement.setInt(2, Integer.parseInt(data[1])); // Assuming column2 is of type INTEGER
               
               // Add the statement to the batch
               statement.addBatch();
           }
           reader.close();
           
           // Execute the batch update
           int[] result = statement.executeBatch();
           
           // Print the number of rows affected by each statement in the batch
           for (int i : result) {
               System.out.println("Rows affected: " + i);
           }
           
           // Close the statement and connection
           statement.close();
           connection.close();
       } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   }

