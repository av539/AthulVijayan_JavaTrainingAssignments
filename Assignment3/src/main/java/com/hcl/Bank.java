package com.hcl;
import java.util.Scanner;

public class Bank 

{
	int currentBalance;
	
		
	public int deposit(int amount, int balance)
	{
		int newBalance=0;
		newBalance = amount + balance;	
		
		currentBalance = newBalance;
		return currentBalance;
	}
	
	public int withdraw(int amount, int balance)
	{
		int newBalance;
	    newBalance = balance - amount;	
		currentBalance = newBalance;
		return currentBalance;
	}
	

	
	
	public static void main(String [] args)
	{
		Bank account = new Bank();
		int overallBalance = 0;
		

		while(overallBalance >= 0)
		{
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
		
		
			System.out.print("Welcome! Would you like to look at your account balance (yes/no)?: ");
			String response = sc1.nextLine();
			if(response.equals("yes"))
			{
				System.out.println("Your overall balance is: " + overallBalance);
				System.out.print("Would you like to deposit into your account or withdraw from your account? (deposit/withdraw): ");
				String response2 = sc1.nextLine();
				if(response2.equals("deposit"))
				{
					System.out.print("How much would you like to deposit?: ");
					int amountDeposited = sc2.nextInt();
					System.out.println("You have deposited " + amountDeposited);
					int newBalance = account.deposit(amountDeposited, overallBalance);
					System.out.println("Your current balance is now: " + newBalance );	
					overallBalance = newBalance;
				}
				else if(response2.equals("withdraw"))
				{
				System.out.print("How much would you like to withdraw?: ");
				int amountWithdrawn = sc3.nextInt();
				System.out.println("You have withdrawn " + amountWithdrawn);
				int newBalance = account.withdraw(amountWithdrawn,overallBalance);
				System.out.println("Your current balance is now: " + newBalance);
				overallBalance = newBalance;
				}
			}
			else if(response.equals("no"))
			{
				System.out.println("Thank You! Please come again!");
				break;
			}
			
		}
	}
	
}
