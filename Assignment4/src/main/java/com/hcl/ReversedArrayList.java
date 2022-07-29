package com.hcl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReversedArrayList 
{
	public static void reverseList(ArrayList<Integer> n)
	{
		
		for(int i=0; i<n.size(); i++)
		{
			System.out.print(n.get(i) + " ");
		}
		
		Collections.reverse(n);
		
		System.out.println();
		
		for(int i=0; i<n.size(); i++)
		{
			System.out.print(n.get(i) + " ");
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);
		
		
		System.out.print("You can add five numbers to this list. Please enter the first number: ");
		int num1 = sc1.nextInt();
		System.out.print("Please enter the second number: ");
		int num2 = sc2.nextInt();
		System.out.print("Please enter the third number: ");
		int num3 = sc3.nextInt();
		System.out.print("Please enter the fourth number: ");
		int num4 = sc4.nextInt();
		System.out.print("Please enter the fifth number: ");
		int num5 = sc5.nextInt();
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);
		numbers.add(num4);
		numbers.add(num5);
		
		System.out.println("Showing original list and then reversing list...");
		
		reverseList(numbers);
		
	}
	
	
	
	
}
