package com.tns.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB_Crud_Insert {

	public static void main(String[] args) 
	{
		// To Connect Eclipse with MySql Server
		String db_URL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String db_User_Name="root";
		String db_Password="Siddhant6674@";
		try
		{
			// To check whether the eclipse is connected with MYSQL or not
			Connection c=DriverManager.getConnection(db_URL, db_User_Name, db_Password);
			// To insert the rows
			String query="INSERT INTO EMPLOYEE(Id,NAME,EMAIL_ID,PASSWORD)VALUES(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 104);
			p.setString(2, "Sid");
			p.setString(3, "Sid@gmail.com");
			p.setString(4, "Sid123");
			int r=p.executeUpdate();
			// if row>0 means at-least some rows are there
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




