package com.training.assignment6;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployeeById 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the id of the employee for the record that you want to delete: ");
		int empId = sc1.nextInt();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "hanuman1234@");
		CallableStatement st = con.prepareCall("{call deleteEmp(?)}");
		st.setInt(1,empId);
		st.execute();
		System.out.println("Record deleted");
	}

}
