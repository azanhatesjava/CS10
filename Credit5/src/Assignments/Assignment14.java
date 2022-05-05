package Assignments;

import java.util.Scanner;
/*

Program: Assignment14.java          Date: 4/25/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment14
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Please enter your age: "); // asks user for age
		int age = input.nextInt(); // records age in variable
		
		if(age <= 5) // checks if age is less than 5
		{
			System.out.print("The user is a toddler."); // tells user they're a toddler
		}
		else if(age <= 10) // checks if age is less than 10
		{
			System.out.print("The user is a child."); // tells user they're a child
		}
		else if(age <= 12) // checks if age is less than 12
		{
			System.out.print("The user is a preteen."); // tells user they're a preteen
		}
		else if(age <= 18) // checks if age is less than 18
		{
			System.out.print("The user is a teen."); // tells user they're a teen
		}
		else
		{
			System.out.print("The user is an adult."); // tells user they're an adult
		}
	}

}
/* Screen Dump

Please enter your age: 7
The user is a child.

*/