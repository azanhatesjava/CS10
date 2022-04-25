package Assignments;

import java.text.NumberFormat;
import java.util.Scanner;
/*

Program: PizzaCost.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/
public class PizzaCost
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		NumberFormat dc = NumberFormat.getCurrencyInstance();
		
		System.out.print("Enter the diameter of the pizza in inches: ");
		int d1 = input.nextInt();
		
		double cost = (0.05*d1*d1 + 1 + 0.75);
		System.out.print("The cost of making pizza is: " + dc.format(cost));
	}

}
/* Screen Dump

Enter the diameter of the pizza in inches: 10
The cost of making pizza is: $6.75

*/