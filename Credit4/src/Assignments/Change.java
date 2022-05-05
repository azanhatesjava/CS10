package Assignments;

import java.util.Scanner;
/*

Program: Change.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/
public class Change 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // Suppresses leaking variable warning
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Please enter the change in cents: "); // asks user for change
		int change = input.nextInt(); // stores change in a variable
		
		int quarters = change / 25; // calculates number of quarters
		int dimes = (change%25)/10; // calculates number of dimes
		int nickels = ((change%25)%10)/5; // calculates number of nickels
		
		System.out.print("The minimum number of coins is: "
				+ "\nQuarters: " + quarters + "\nDimes: " 
				+ dimes + "\nNickels: " + nickels); // prints final output
	}

}
/* Screen Dump

Please enter the change in cents: 212
The minimum number of coins is: 
Quarters: 8
Dimes: 1
Nickels:0

*/