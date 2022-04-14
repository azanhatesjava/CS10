package Assignments;

import java.util.Scanner;

public class Assignment15
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*10+1);
		int num2 = (int)(Math.random()*10+1);
		int op0 = (int)(Math.random()*4+1); // (*,+,-,/)
		
		
		if(op0 == 1)
		{
			System.out.print("What is " + num1 + "*" + num2 + "?");
			int ans = input.nextInt();
			
			if(ans == (num1*num2))
			{
				System.out.print("You got it right! Congratulations!");
			}
			else
			{
				int ans2 = (num1*num2);
				System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2);
			}
		}
		else if(op0 == 2)
		{
			System.out.print("What is " + num1 + "+" + num2 + "?");
			int ans = input.nextInt();
			
			if(ans == (num1+num2))
			{
				System.out.print("You got it right! Congratulations!");
			}
			else
			{
				int ans2 = (num1+num2);
				System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2);
			}
		}
		else if(op0 == 3)
		{
			System.out.print("What is " + num1 + "-" + num2 + "?");
			int ans = input.nextInt();
			
			if(ans == (num1-num2))
			{
				System.out.print("You got it right! Congratulations!");
			}
			else
			{
				int ans2 = (num1-num2);
				System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2);
			}
		}
		else
		{
			System.out.print("What is " + num1 + "/" + num2 + "?");
			int ans = input.nextInt();
			
			if(ans == (num1/num2))
			{
				System.out.print("You got it right! Congratulations!");
			}
			else
			{
				int ans2 = (num1/num2);
				System.out.print("Sorry, that wasn't the right answer. The right answer is " + ans2);
			}
		}
		
	}

}
