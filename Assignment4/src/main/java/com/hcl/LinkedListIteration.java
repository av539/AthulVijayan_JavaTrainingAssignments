package com.hcl;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListIteration 
{
	public static void iterateList(int n , LinkedList<Integer>list )
	{
		
		for(int i=n; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
			
	}
	
	public static void main(String [] args)
	{

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);
		Scanner sc6 = new Scanner(System.in);
		
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
		
		System.out.print("Please enter the index that you like to start from when iterating through the list (0-4): ");
		int index = sc6.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.add(num4);
		list.add(num5);
		System.out.println("Iterating from index " + index + " : ");
		iterateList(index,list);
	}
}
