package com.training.assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetEmployeeNameById 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id of the employee that you would like to get the name from the records: ");
		int empId = sc.nextInt();
		Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "hanuman1234@");
		PreparedStatement st3 =  con3.prepareStatement("Select name from emp1 where id = ?");
		st3.setInt(1, empId);
		ResultSet r = st3.executeQuery();
		while (r.next())
		{
			System.out.println(r.getString("name"));
		}
	}
}
