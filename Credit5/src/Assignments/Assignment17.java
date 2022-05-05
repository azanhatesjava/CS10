package Assignments;

import java.util.Scanner;
/*

Program: Assignment17.java          Date: 4/27/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10

*/
public class Assignment17 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input variable"
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Please enter your gpa (Input \"-1\" to terminate the program):"); // asks user for gpa
		double gpa = input.nextDouble(); // stores gpa in variable
		
		if (gpa == -1) // checks if input is -1
		{
			System.out.print("Thank you for using our program, have a great day"); // exit message
			System.exit(0); // ends program
		}
		while (gpa != -1) // if input is not -1
		{
			
			if (gpa >= 3.8) // checks if gpa is greater than 3.8
			{
				System.out.print("\nsumma cum laude"); // prints output
			}
			else if (gpa >= 3.65) // checks if gpa is greater than 3.65
			{
				System.out.print("\nmagna cum laude"); // prints output
			}
			else if (gpa >= 3.5) // checks if gpa is greater than 3.5
			{
				System.out.print("\ncum laude"); // prints output
			}
			else
			{
				System.out.print("\nSorry, at this time you did not qualify for an honors distinction"); // tells user they didn't qualify
			}
			
			System.out.print("\nPlease enter -1 to terminate the program or enter another gpa:"); // asks user if they want to run program again
			gpa = input.nextDouble(); // re-records gpa
			if (gpa == -1) // checks if input is -1
			{
				System.out.print("Thank you for using our program, have a great day"); // exit message
				System.exit(0); // ends program
			}
		}
	}
}
/* Screen Dump

Please enter your gpa (Input "-1" to terminate the program): 3.9

summa cum laude
Please enter -1 to terminate the program or enter another gpa: 3.65

magna cum laude
Please enter -1 to terminate the program or enter another gpa: 3.4

Sorry, at this time you did not qualify for an honors distinction
Please enter -1 to terminate the program or enter another gpa: -1
Thank you for using our program, have a great day

*/