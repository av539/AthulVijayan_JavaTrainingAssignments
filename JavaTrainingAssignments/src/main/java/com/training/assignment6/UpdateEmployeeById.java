package com.training.assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployeeById 
{
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		// Problem 2: Update the existing employee based on his/her id
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "hanuman1234@");
		PreparedStatement st2;
		System.out.print("Please enter the id of the employee you want to update: ");
		int empId = sc1.nextInt();
		System.out.print("Would you like to update the name or the age of the employee (name/age)?: ");
		String ans1 = sc2.nextLine();
		if(ans1.equals("name"))
		{
			System.out.print("Enter the name that you like to update the record to: ");
			String empName = sc3.nextLine();
			st2 = con.prepareStatement("update emp1 set name=? where id=?");
			st2.setString(1, empName);
			st2.setInt(2, empId);
			st2.execute();
			System.out.println("Record with new name updated");
		}
		
		else if(ans1.equals("age"))
		{
			System.out.print("Enter the age that you like to update the record to: ");
			int empAge = sc3.nextInt();
			st2 = con.prepareStatement("update emp1 set age=? where id=?");
			st2.setInt(1, empAge);
			st2.setInt(2, empId);	
			st2.execute();
			System.out.println("Record with new age updated");

		}
	}
}
