package com.hcl;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReplaceElement {
	
	public static void replace(int a , int b, LinkedList<Integer> l)
	{
		Collections.replaceAll(l,a,b);
		for(int i=0; i<l.size(); i++)
		{
			System.out.print(l.get(i) + " ");
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
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.add(num4);
		list.add(num5);
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		System.out.print("Please select the index of the number you'd like to replace: ");
		int index = sc6.nextInt();
		System.out.print("Please select the number that will replace the number at that index: ");
		int replacement = sc7.nextInt();
		replace(list.get(index),replacement,list);
	
	}

}
