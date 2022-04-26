package lol;

import java.util.Scanner;

public class Assignment6
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name? ");
		String fn = input.next();
		
		System.out.println("What is your last name? ");
		String ln = input.next();
		
		System.out.println("What grade are you in? ");
		int grd = input.nextInt();
		input.nextLine(); // consume newline left-over
		
		System.out.println("What school do you attend? ");
		String schl = input.nextLine();
		
		System.out.println("What is your favourite hobby? ");
		String hby = input.nextLine();
		
		System.out.print("Hello, your name is " + fn + " " + ln + ", you are currently in grade " + grd + " at " + schl + ". Your favourite hobby is " + hby + ".");
	}

}
