package Assignments;

import java.util.Scanner;
/*

Program: Grade.java          Date: 4/25/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/
public class Grade
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource") // suppresses warning from leaking "input" variable
		Scanner input = new Scanner(System.in); // calls in scanner
		
		System.out.print("Enter a grade percentage: "); // asks user for grade
		int grade = input.nextInt(); // stores grade in variable
		
		if (grade <= 100 && grade >=90) // checks if grade is from 90-100
		{
			System.out.print("The corresponding letter grade is: A+"); // tells user they have an A+
		}
		else if (grade <= 89 && grade >= 80) // checks if grade is from 80-89
		{
			System.out.print("The corresponding letter grade is: A"); // tells user they have an A
		}
		else if (grade <=79 && grade >= 75) // checks if grade is from 75-79
		{
			System.out.print("The corresponding letter grade is: B+"); // tells user they have a B+
		}
		else if (grade <= 74 && grade >= 70) // checks if grade is from 70-74
		{
			System.out.print("The corresponding letter grade is: B"); // tells user they have a B
		}
		else if (grade <= 69 && grade >= 65) // checks if grade is from 65-69
		{
			System.out.print("The corresponding letter grade is: C+"); // tells user they have a C+
		}
		else if (grade <= 64 && grade >= 60) // checks if grade is from 60-64
		{
			System.out.print("The corresponding letter grade is: C"); // tells user they have a C
		}
		else if (grade <= 59 && grade >= 55) // checks if grade is from 55-59
		{
			System.out.print("The corresponding letter grade is: D+"); // tells user they have a D+
		}
		else if (grade <= 54 && grade >= 50) // checks if grade is from 50-54
		{
			System.out.print("The corresponding letter grade is: D"); // tells user they have a D
		}
		else
		{
			System.out.print("The corresponding letter grade is: F"); // tells user they have an F
		}
	}

}
/* Screen Dump

Enter a grade percentage: 75
The corresponding letter grade is: B+

*/