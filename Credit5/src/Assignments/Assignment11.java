package Assignments;

import java.util.Scanner;

/*

Program: Assignment8.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment11
{

	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Please enter any three digits: "); // asks for input
		int digits = input.nextInt(); // records input
		
		int num1 = digits/100; // isolates first digit
		int num2 = digits%100/10; // isolates second digit
		int num3 = digits%100%10; // isolates third digit
		
		if (num1 >= num2 && num1 >= num3) // checks if num1 is the highest number
		{
			System.out.println("\nThe largest of the three digits is: " + num1); // says num1 is the highest
		}
		else if (num2 >= num1 && num2 >= num3) // checks if num2 is the highest number
		{
			System.out.println("\nThe largest of the three digits is: " + num2); // says num2 is the highest
		}
		else // determines that num3 is the highest number
		{
			System.out.println("\nThe largest of the three digits is: " + num3); // says num3 is the highest
		}
		
		if (num1 <= num2 && num1 <= num3) // checks if num1 is the smallest number
		{
			System.out.println("The smallest of the three digits is: " + num1); // says num1 is the smallest
		}
		else if (num2 <= num1 && num2 <= num3) // checks if num2 is the smallest number
		{
			System.out.println("The smallest of the three digits is: " + num2); // says num2 is the smallest
		}
		else // determines that num3 is the smallest number
		{
			System.out.println("The smallest of the three digits is " + num3); // says num3 is the smallest
		}
		
		System.out.println("The sum of the three digits is: " + (num1 + num2 + num3)); // adds the three digits
		System.out.println("The product of the three digits is: " + (num1 * num2 * num3)); // multiplies the three digits
		System.out.println("The average of the three digits is: " + ((num1 + num2 + num3)/3)); // averages the three digits
	}

}
/*

Please enter any three digits: 569

The largest of the three digits is: 9
The smallest of the three digits is: 5
The sum of the three digits is: 20
The product of the three digits is: 270
The average of the three digits is: 6


*/