package com.hcl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwappingElements 
{
	public static void swapElement(ArrayList<Integer>numbers,int x, int y)
	{
		
		
		for(int i=0; i<numbers.size(); i++)
		{
			System.out.print(numbers.get(i) + " ");
			
		}
		
		Collections.swap(numbers, x, y);
		
		
		System.out.println();
		
		for(int i=0; i<numbers.size(); i++)
		{
			System.out.print(numbers.get(i) + " ");
			
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
		Scanner sc7 = new Scanner(System.in);

		
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
		
		System.out.print("Please enter the first index that has the number you want to swap with: ");
		int first = sc6.nextInt();
		System.out.print("Please enter the second index that has the number you want to swap with: ");
		int second = sc7.nextInt();
		
		System.out.println("Shwoing original list and then swapping selected elements...");
		
		swapElement(numbers,first,second);
		
	}
}
