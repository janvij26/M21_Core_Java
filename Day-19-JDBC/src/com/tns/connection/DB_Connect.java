package com.tns.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connect {

	public static void main(String[] args) throws SQLException {
		String db_Driver="com.mysql.cj.jdbc.Driver";
		// To Connect Eclipse with MySql Server
		String db_URL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String db_User_Name="root";
		String db_Password="Siddhant6674@";
		String query="SELECT * FROM STUDENT";
		// If any Exception will occur in Driver Class that will handle by Catch Block
		// If the Driver Class Name is incorrect then it will throw Exception
		try
		{
			Class.forName(db_Driver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
		Connection c=DriverManager.getConnection(db_URL, db_User_Name, db_Password);
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery(query);
		
		while(r.next())
		{
			String data="";
			// Column 
			for(int i=1;i<=2;i++)
			{
				data=data+" "+r.getString(i);
			}
			System.out.println(data);
		 }
		}	
		catch(SQLException e)
		{
			System.out.println("Invalid URL/ID/PASSWORD");
			e.printStackTrace();
		}
	}

}
