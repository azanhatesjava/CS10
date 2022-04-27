package Assignments;

import java.util.Scanner;

/*

Program: Assignment9.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment9
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking "input" variable
		Scanner input = new Scanner(System.in); //  calls in scanner
		
		System.out.print("Enter an integer: "); //  asks the user for an integer
		int int1 = input.nextInt(); // records input
		
		System.out.print("Enter a second-integer: "); //  asks the user for an integer
		int int2 = input.nextInt(); // records input
		
		if(int2 == 0) // checks if second integer is 0
		{
			System.out.print("Sorry, you can't divide by zero");
			System.exit(0); // terminates the program
		}
		
		int ans1 = (int1/int2); // divides integers
		
		int ans2 = (int1%int2); // finds remainder of integers
		
		System.out.println("\n" + int1 + " / " + int2 + " = " + ans1); // prints quotient
		System.out.print(int1 + " % " + int2 + " = " + ans2); // prints remainder
	}

}
/* Screen Dump

Enter an integer: 14
Enter a second-integer: 4

14 / 4 = 3
14 % 4 = 2

*/