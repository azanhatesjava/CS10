package lol;

import java.util.Scanner;

public class GuessingGame 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 and 20: ");
		int inp = input.nextInt();
		int rndm = (int)(Math.random()*20+1);
		
		System.out.println("\nComputer's number is " + rndm);
		System.out.println("Player's number is " + inp);
		
		if (inp == rndm)
		{
			System.out.print("You won!");
		}
		else
		{
			System.out.print("\nBetter luck next time!");
		}
	}

}
/*

Enter a number between 1 and 20: 5

Computer's number is 5
Player's number is 5
You won!

*/