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
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int int1 = input.nextInt();
		
		System.out.print("Enter a second-integer: ");
		int int2 = input.nextInt();
		
		if(int2 == 0)
		{
			System.out.print("Sorry, you can't divide by zero");
			System.exit(0);
		}
		
		int ans1 = (int1/int2);
		
		int ans2 = (int1%int2);
		
		System.out.println("\n" + int1 + " / " + int2 + " = " + ans1);
		System.out.print(int1 + " % " + int2 + " = " + ans2);
	}

}

/*

Enter an integer: 14
Enter a second-integer: 4

14 / 4 = 3
14 % 4 = 2

*/