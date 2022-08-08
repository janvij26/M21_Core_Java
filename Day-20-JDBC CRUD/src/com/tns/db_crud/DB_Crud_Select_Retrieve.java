package com.tns.db_crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Crud_Select_Retrieve {

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
			String query="SELECT * FROM EMPLOYEE";
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery(query);
			//int count=0;
			while(r.next())
			{
				int id=r.getInt(1);
				String name=r.getString(2);
				String email=r.getString(3);
				String password=r.getString(4);
				
				String output="User :%d %s %s %s";
				System.out.println(String.format(output, id,name,email,password));
				
			}
			c.close();
		 }
		 catch(SQLException e)
		 {
			e.printStackTrace();
		 }
							
	}
		
}