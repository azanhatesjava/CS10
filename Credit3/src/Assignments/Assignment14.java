package Assignments;

import java.util.Scanner;

public class Assignment14
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		
		if(age <= 5)
		{
			System.out.print("The user is a toddler.");
		}
		else if(age <= 10)
		{
			System.out.print("The user is a child.");
		}
		else if(age <= 12)
		{
			System.out.print("The user is a preteen.");
		}
		else if(age <= 18)
		{
			System.out.print("The user is a teen.");
		}
		else
		{
			System.out.print("The user is an adult.");
		}
	}

}
