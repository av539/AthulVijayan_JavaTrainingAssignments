package com.hcl;
import java.util.Scanner;

public class ReverseWord 
{
	public static String reverseWord(String w)
	{
			char letter;
			String reverse ="";
			for(int i=w.length()-1; i>=0; i--)
			{
				letter = w.charAt(i);
				reverse = reverse + letter;
			}
			
			return reverse;
	}
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word that you would like to reverse: ");
		String word = sc.nextLine();
		
		System.out.println(reverseWord(word));
		
		
	}
}
