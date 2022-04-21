package lol;

import java.util.Scanner;
/*

Program: Assignment8.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment8 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Enter a three-digit number: "); // prompts the user to enter input
		int num = input.nextInt(); // takes in the input
		
		String num0 = Integer.toString(num); // converts integer to a string
		char num1 = num0.charAt(0); // isolates first digit
		char num2 = num0.charAt(1); // isolates second digit
		char num3 = num0.charAt(2); // isolates third digit
		
		System.out.println("\nThe hundreds-place digit is: " + num1); // prints first digit
		System.out.println("The tens-place digit is: " + num2); // prints second digit
		System.out.println("The ones-place digit is: " + num3); // prints third digit
		
		
	}

}

/*

Enter a three-digit number: 385

The hundreds-place digit is: 3
The tens-place digit is: 8
The ones-place digit is: 5

 */
