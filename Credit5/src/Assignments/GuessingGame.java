package Assignments;

import java.util.Scanner;
/*

Program: GuessingGame.java          Date: 4/27/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10

*/
public class GuessingGame 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Enter a number between 1 and 20: "); // asks user for guess
		int inp = input.nextInt(); // stores input in variable
		int rndm = (int)(Math.random()*20+1); // generates random number from 1 - 20
		
		System.out.println("\nComputer's number is " + rndm); // prints random number
		System.out.println("Player's number is " + inp); // prints player's number
		
		if (inp == rndm) // checks if player's number = random number
		{
			System.out.print("You won!"); // tells user they won
		}
		else
		{
			System.out.print("\nBetter luck next time!"); // tells user they lost
		}
	}

}
/* Screen Dump

Enter a number between 1 and 20: 5

Computer's number is 5
Player's number is 5
You won!

*/