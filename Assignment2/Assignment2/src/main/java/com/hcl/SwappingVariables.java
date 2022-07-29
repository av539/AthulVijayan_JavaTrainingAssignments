package com.hcl;
import java.util.Scanner;

public class SwappingVariables 
{
	
	public static void swap(int x, int y)
	{
	
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("The value of a is now : " + x);
		System.out.println("The value of b is now : " + y);

	}
	
	public static void main(String [] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = sc1.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc2.nextInt();
		
		swap(a,b);
		
		
	}
	
	

}
