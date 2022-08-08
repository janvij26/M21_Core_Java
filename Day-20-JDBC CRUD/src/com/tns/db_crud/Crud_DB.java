package com.tns.db_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Crud_DB {

	public static void main(String[] args) throws SQLException {
		// To Connect Eclipse with MySql Server
		String db_URL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String db_User_Name="root";
		String db_Password="Siddhant6674@";
		try
		{
			// To check whether the eclipse is connected with MYSQL or not
			Connection c=DriverManager.getConnection(db_URL, db_User_Name, db_Password);
			if(c!=null)
			{
				System.out.println("Connection is Established");
				// Once the connection is stored, 
				c.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}		
	}

}
