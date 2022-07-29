package com.hcl;
import java.util.Scanner;

public class FibonacciSeries 
{
	
	public static void getFibonacciSeries(int n)
	{

		int[] arr = new int[n];
		
		
		for(int i = 0; i<n; i++)
		{
			if(i == 0 || i == 1)
			{
				arr[i] = i;
				System.out.print(arr[i] + " ");
			}
			
			else
			{
			arr[i] = arr[i-1] + arr[i-2];
			System.out.print(arr[i] + " ");
			}
		}
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the value that you want the Fibonacci Series to go up until: ");
		int n = sc.nextInt();
		sc.close();
		getFibonacciSeries(n);
	}
}
