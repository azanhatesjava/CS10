package test;

import java.util.Scanner;

public class Idea1 
{

	public static void main(String[] args) 
	{
		
		String one = "play";
		while (one=="play")
		{
		Scanner input = new Scanner(System.in);
		int comp = 1 + (int)(Math.random()*3);
		System.out.println("\r\nEnter rock paper or scissors: ");
		String player = input.nextLine();
		String message = "Error";
		if (player=="rock" && comp==1)
		{
			message = "Computer: rock \r\nIt's a Tie";
		}
		else if (player.equals("paper") && comp==2)
		{
			message = "Computer: paper \r\nIt's a Tie";
		}
		else if (player.equals("scissors") && comp==3)
		{
			message = "Computer: scissors \r\nIt's a Tie";
		}
		else if (player=="rock" && comp==2)
		{
			message = "Computer: paper \r\nYou lose!";
		}
		else if (player=="paper" && comp==3)
		{
			message = "Computer: scissors \r\nYou lose!";
		}
		else if (player=="scissors" && comp==1)
		{
			message = "Computer: rock \r\nYou lose!";
		}
		else if (player=="rock" && comp==3)
		{
			message = "Computer: scissors \r\nYou win!";
		}
		else if (player=="paper" && comp==1)
		{
			message = "Computer: rock \r\nYou win!";
		}
		else if (player=="scissors" && comp==2)
		{
			message = "Computer: paper \r\nYou win!";
			
		}
		System.out.println("You: "+player+"\r\n"+message+"\r\n\r\n"
			+ "Enter play to continue playing or anything else to exit the program.");
		one = input.nextLine();
		}
		System.out.println("\r\nYou have exited the program. Have a good day and come back soon!");
	}

}