package lol;

import java.util.Scanner;

/*

Program: Assignment8.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment11
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter any three digits: ");
		int input1 = input.nextInt();
		String digits = Integer.toString(input1);
		
		int raw1 = digits.charAt(0);
		int raw2 = digits.charAt(1);
		int raw3 = digits.charAt(2);
		
		int num1 = (raw1 - 48);
		int num2 = (raw2 - 48);
		int num3 = (raw3 - 48);
		
		if (num1 >= num2 && num1 >= num3)
		{
			System.out.println("\nThe largest of the three digits is: " + num1);
		}
		else if (num2 >= num1 && num2 >= num3)
		{
			System.out.println("\nThe largest of the three digits is: " + num2);
		}
		else
		{
			System.out.println("\nThe largest of the three digits is: " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3)
		{
			System.out.println("The smallest of the three digits is: " + num1);
		}
		else if (num2 <= num1 && num2 <= num3)
		{
			System.out.println("The smallest of the three digits is: " + num2);
		}
		else
		{
			System.out.println("The smallest of the three digits is " + num3);
		}
		
		System.out.println("The sum of the three digits is: " + (num1 + num2 + num3));
		System.out.println("The product of the three digits is: " + (num1 * num2 * num3));
		System.out.println("The average of the three digits is: " + ((num1 + num2 + num3)/3));
	}

}
/*

Please enter any three digits: 569

The largest of the three digits is: 9
The smallest of the three digits is: 5
The sum of the three digits is: 20
The product of the three digits is: 270
The average of the three digits is: 6


*/