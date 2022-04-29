package test;

import java.util.Scanner;

public class test1 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your full name: ");
		String fullName = input.nextLine();
		
		System.out.println("What grade are you in: ");
		int grade = input.nextInt();
		
		if(fullName.equalsIgnoreCase("Kitchen"))
		{
			if(grade == 10)
			{
				System.out.println("You're in grade 10");
			}
			else
			{
				System.out.println("You must not be in grade 10");
			}
		}
		else
		{
			System.out.println("Sorry, you must be another AP student");
		}
	}

}
