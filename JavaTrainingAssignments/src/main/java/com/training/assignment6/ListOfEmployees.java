package com.training.assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ListOfEmployees 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		 //Problem 1: Getting a list of employees by name
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to see a list of all the employees in the database(yes/no): ");
		String ans = sc.nextLine();
		if(ans.equals("yes"))
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "hanuman1234@");
			PreparedStatement st = con.prepareStatement("SELECT * FROM emp1");
	
			ResultSet rs = st.executeQuery();
			while (rs.next())
			{
			System.out.println(rs.getString("name"));
			}
		}
		
		else if(ans.equals("no"))
		{
			System.out.println("Thank You! Please come back when you're ready to see the list of records");
		}
			
	}
	
	
}
