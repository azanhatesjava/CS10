package test;

import java.util.Scanner;

/*

Program: Credit3.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/
public class Credit3 
{

	public static void main(String[] args) 
	{
		int grade; // DECLARATION; integer = numbers
		String name; // String = string/line of text
		double price; // double = decimals
		char firstInitial; // char = characters
		
		grade = 87; // initialization
		System.out.println(grade);
		
		name = "Azan Kamran";
		System.out.println(name.length());
		System.out.println(name.substring(4));
		
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, What is your name?");
		String fullName = input.nextLine();

		
		System.out.println("How old are you?");
		int age = input.nextInt();
		
		System.out.print("Your name is: " + fullName + " and your age is " + age);
	}

}