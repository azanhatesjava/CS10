package lol;

import java.util.Scanner;

public class Assignment17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your gpa (Input \"-1\" to terminate the program):");
		double gpa = input.nextDouble();
		
		if (gpa == -1)
		{
			System.out.print("Thank you for using our program, have a great day");
			System.exit(0);
		}
		while (gpa != -1)
		{
			
			if (gpa >= 3.8)
			{
				System.out.print("summa cum laude");
			}
			else if (gpa >= 3.65)
			{
				System.out.print("magna cum laude");
			}
			else if (gpa >= 3.5)
			{
				System.out.print("cum laude");
			}
			else
			{
				System.out.print("\nSorry, at this time you did not qualify for an honors distinction");
			}
			
			System.out.print("\nPlease enter -1 to terminate the program or enter another gpa:");
			gpa = input.nextDouble();
			if (gpa == -1)
			{
				System.out.print("Thank you for using our program, have a great day");
				System.exit(0);
			}
		}
	}
}
