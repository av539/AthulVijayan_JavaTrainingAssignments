package com.hcl;
import java.util.Scanner;
public class SumOfInteger 
{
	public static boolean isEqual(int x, int y, int z)
	{
		int sum = x + y;
		
		if (z == sum)
		{
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = sc1.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc2.nextInt();
		System.out.print("Enter the value of c: ");
		int c = sc3.nextInt();
		
		System.out.println(isEqual(a,b,c));
	}

}
