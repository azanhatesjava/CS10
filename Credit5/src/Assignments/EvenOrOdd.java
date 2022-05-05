package Assignments;

import java.util.Scanner;
/*

Program: EvenOrOdd.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/
public class EvenOrOdd
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Enter an integer: ");
		int int1 = input.nextInt(); // stores input in a variable
		
		int int2 = (int1/2); // divides input by half
		int ans1 = (int1%int2); // gets remainder of half of input
		
		if(ans1 == 1) // checks if there's a remainder of 1
		{
			System.out.print("\nThe integer " + int1 + " is odd."); // tells user it's odd
		}
		else
		{
			System.out.print("\nThe integer " + int1 + " is even."); // tells user it's even
		}
	}

}
/*

Enter an integer: 48935

The integer 48935 is odd.

*/
