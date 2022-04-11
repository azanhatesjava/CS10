package Assignments;

import java.util.Scanner;

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
			System.out.print("The integer " + int1 + " is odd.");
		}
		else
		{
			System.out.print("The integer " + int1 + " is even.");
		}
	}

}
