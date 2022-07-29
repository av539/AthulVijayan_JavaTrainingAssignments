package com.hcl;
import java.util.Scanner;

public class Vehicle 
{
	int vehicle_number;
	String vehicle_model;
	String vehicle_color;
	int loadingCapacity;
	
	public Vehicle(int number,String model,String color, int loadingCapacity)
	{
		this.vehicle_number = number;
		this.vehicle_model = model;
		this.vehicle_color = color;
		this.loadingCapacity = loadingCapacity;
	}
	
	public void toChange(String color, int loadingCapacity)
	{
		System.out.println("Your " + vehicle_model + " truck with a vehicle number of " + vehicle_number + " has changed its color to " + color + " and its loading capacity to " + loadingCapacity + " tons ");
	}
	
	public static void main(String [] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);
		Scanner sc6 = new Scanner(System.in);


		
		int loadingCapacity = 100;
		
		
		System.out.print("Please enter the vehicle number of your truck: ");
		int vehicleNum = sc1.nextInt();
		System.out.print("Please enter the model of your truck: ");
		String model = sc2.nextLine();
		System.out.print("Please enter the color of your truck: ");
		String color = sc3.nextLine();
		System.out.print("Would you like to update the color and loading capacity of your truck? (yes/no): ");
		String ans = sc4.nextLine();
		
		Vehicle truck = new Vehicle(vehicleNum,model,color,loadingCapacity);
		
		if(ans.equals("yes"))
		{
			System.out.print("The color of your truck is currently " + color + " . What color would you like to change it to ?: ");
			String newColor = sc5.nextLine();
			System.out.print("The loading capacity of your truck is currently " + loadingCapacity + " tons. What capacity would you like to change it to ?: ");
			int newLoadingCapacity = sc6.nextInt();
			truck.toChange(newColor, newLoadingCapacity);		
		}
		else if(ans.equals("no"))
		{
			System.out.print("Your " + model + " truck with a vehicle number of " + vehicleNum + " has the color of " + color + " and a loading capacity of " + loadingCapacity + " tons ");
			
		}
		
		
		
		
		
		
		
		
		
		
	


		
	}
}
