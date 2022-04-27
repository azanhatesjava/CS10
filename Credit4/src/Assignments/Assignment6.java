package Assignments;

import java.util.Scanner;
/*

Program: Assignment6.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment6
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning for leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("What is your first name? "); // asks for first name
		String fn = input.nextLine(); // stores input in a new variable
		
		System.out.print("What is your last name? "); // asks for last name
		String ln = input.nextLine(); // stores input in a new variable
		
		System.out.print("What grade are you in? "); // asks for grade
		int grd = input.nextInt(); // stores input in a new variable
		input.nextLine(); // consumes newline left-over
		
		System.out.print("What school do you attend? "); // asks for school
		String schl = input.nextLine(); // stores input in a new variable
		
		System.out.print("What is your favourite hobby? "); // asks for hobby
		String hby = input.nextLine(); // stores input in a new variable
		
		System.out.print("\nHello, your name is " + fn + " " + ln + ", you are currently in grade " + grd + " at " + schl + ". Your favourite hobby is " + hby + "."); // tells user their input
	}

}
/* Screen Dump

What is your first name? Azan
What is your last name? Kamran
What grade are you in? 10
What school do you attend? Crescent Heights High School
What is your favourite hobby? Reading

Hello, your name is Azan Kamran, you are currently in grade 10 at Crescent Heights High School. Your favourite hobby is Reading.

*/