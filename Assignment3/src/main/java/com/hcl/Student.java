package com.hcl;
import java.util.Scanner;

public class Student 
{
	
	public String average(int score1, int score2, int score3)
	{
		int sum = score1 + score2 + score3;
		int average = sum / 3;
		
		if(average >= 50)
		{
			return "Passed";
		}
		
		else
		{
			return "Failed";
		}
	}
	
	public String input(String name)
	{
		return  name;
	}
	
	
	public static void main(String [] args)
	{
		Student s = new Student();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		String name = sc1.nextLine();
		System.out.println("Hello " + s.input(name));
		System.out.print("Please enter first exam score: ");
		int x = sc2.nextInt();
		System.out.print("Please enter second exam score: ");
		int y = sc3.nextInt();
		System.out.print("Please enter third exam score: ");
		int z = sc4.nextInt();
		
		System.out.println("Your exam average score indicates that you have: " + s.average(x, y, z));
		
		
	}
	
}
