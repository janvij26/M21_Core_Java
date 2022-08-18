package com.tns.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB_Crud_Insert {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Siddhant6674@";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//to inert a rows
			String query="INSERT INTO Student_jdbc (ID,NAME,EMAIL_ID,PASSWORD)VALUES(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 103);
			p.setString(2, "Sid");
			p.setString(3, "Sid@gmail.com");
			p.setString(4, "Sid@123");
			int r=p.executeUpdate();
			//if row>0 means at-least some rows are there
			if(r>0)
			{
				System.out.println("A new user is inserted successfully");
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}