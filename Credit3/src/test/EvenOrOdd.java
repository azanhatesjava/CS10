package test;

import java.util.Scanner;

/*

Program: EvenOrOdd.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/

public class EvenOrOdd
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int int1 = input.nextInt();
		
		int int2 = (int1/2);
		int ans1 = (int1%int2);
		
		if(ans1 == 1)
		{
			System.out.print("\nThe integer " + int1 + " is odd.");
		}
		else
		{
			System.out.print("\nThe integer " + int1 + " is even.");
		}
	}

}
/*

Enter an integer: 48935

The integer 48935 is odd.

*/
