package com.hcl;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class HashSetToArray 
{
	public static void convertHashSetToArray(HashSet<Integer> hashSet)
	{
		
		Object[] array = hashSet.toArray();
		
		System.out.println("New Array");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		
	}
	
	public static void main(String[] args)
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
		
		HashSet <Integer> hashSet = new HashSet<Integer>();
		hashSet.add(num1);
		hashSet.add(num2);
		hashSet.add(num3);
		hashSet.add(num4);
		hashSet.add(num5);
		
		System.out.println("Converting from hashset to array...");
		
		convertHashSetToArray(hashSet);
		
	}
}
