package Assignments;

import java.util.Scanner;

/*

Program: Assignment8.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment8 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit number: ");
		int num = input.nextInt();
		String num0 = Integer.toString(num);
		char num1 = num0.charAt(0);
		char num2 = num0.charAt(1);
		char num3 = num0.charAt(2);
		
		System.out.println("\nThe hundreds-place digit is: " + num1);
		System.out.println("The tens-place digit is: " + num2);
		System.out.println("The ones-place digit is: " + num3);
		
		
	}

}

/*

Enter a three-digit number: 385

The hundreds-place digit is: 3
The tens-place digit is: 8
The ones-place digit is: 5

 */
