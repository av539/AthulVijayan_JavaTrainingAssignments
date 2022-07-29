package com.hcl;

import java.util.Scanner;

public class WashingMachine 
{
	public void switchO()
	{
		System.out.println("Your washing machine has turned on");
	}
	public  void switchOFF()
	{
		System.out.println("Your washing machine has turned off. Thank You!");
	}
	
	public void acceptDetergent()
	{
		System.out.println("Detergent has been added");
	}
	
	public void acceptClothes(int numOfClothes)
	{
		System.out.println("The washing machine has accepted " + numOfClothes + " clothes. Beginning wash now. ");
	}
	
	
	public static void main(String [] args)
	{
		WashingMachine w = new WashingMachine();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Hello! Would you like to turn on your washing machine(yes/no) : ");
		String ans = sc1.nextLine();
	
		if(ans.equals("yes"))
		{
			
			w.switchO();
			System.out.print("Please enter the number of clothes you would like to wash: ");
			int n = sc2.nextInt();
			w.acceptDetergent();
			w.acceptClothes(n);
			
			System.out.print("Would you like to turn off your washing machine?(yes/no) : ");
			String ans2 = sc3.nextLine();
			if(ans2.equals("yes"))
			{
				w.switchOFF();
			}
			else if(ans2.equals("no"))
			{
				System.out.print("Okay! Your washing machine will continue to wash your clothes");
			}
		}
		
		else if(ans.equals("no"))
		{
			System.out.print("Okay! Come back when you're ready to wash your clothes!");
			
		}
		
	}

}
