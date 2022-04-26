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
		@SuppressWarnings("resource") // suppresses leaking input variable
		Scanner input = new Scanner(System.in); // calls in scanner
		NumberFormat dc = NumberFormat.getCurrencyInstance(); // formats dc for currency
		
		System.out.print("Enter the diameter of the pizza in inches: "); // asks user for diameter
		int d1 = input.nextInt(); // takes in input
		
		double cost = (0.05*d1*d1 + 1 + 0.75); // calculates pizza cost
		System.out.print("The cost of making pizza is: " + dc.format(cost)); // prints cost of pizza
	}

}
/* Screen Dump

Enter the diameter of the pizza in inches: 10
The cost of making pizza is: $6.75

*/