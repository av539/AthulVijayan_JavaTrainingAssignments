package com.hcl;
import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean isPrime(int n)
	{
		boolean isPrime = true;
		if(n == 0 || n == 1)
		{
			isPrime = false;
		}
		for(int i = 2; i <= n/2; i++)
		{
			
			if(n%i == 0)
			{
				isPrime = false;
			}
				
		}
		
		return isPrime;
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for prime values to be counted until: ");
		int n = sc.nextInt();
		sc.close();
		
	
		
		for(int i = 0; i<=n; i++)
		{
			if(isPrime(i) == true)
			{
				
				System.out.print(i + " ");
			}

		}
		

	}

}
