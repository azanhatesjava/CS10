package Assignments;

import java.text.NumberFormat;
import java.util.Scanner;

public class Assignment13
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		NumberFormat dc = NumberFormat.getCurrencyInstance();
		
		System.out.print("Enter the number of copies to be printed: ");
		int copies = input.nextInt();
		
		if(copies >=0 && copies <= 99)
		{
			double cost = (copies*0.30);
			
			System.out.println("\nPrice per copy is: $0.30");
			System.out.print("Total cost is: " + dc.format(cost));
		}
		else if(copies >=100 && copies <= 499)
		{
			double cost = (copies*0.28);
			
			System.out.println("\nPrice per copy is: $0.28");
			System.out.print("Total cost is: " + dc.format(cost));
		}
		else if(copies >=500 && copies <= 749)
		{
			double cost = (copies*0.27);
			
			System.out.println("\nPrice per copy is: $0.27");
			System.out.print("Total cost is: " +dc.format(cost));
		}
		else if(copies >=750 && copies <= 1000)
		{
			double cost = (copies*0.26);
			
			System.out.println("\nPrice per copy is: $0.26");
			System.out.print("Total cost is: " + dc.format(cost));
		}
		else
		{
			double cost = (copies*0.25);
			
			System.out.println("\nPrice per copy is: $0.25");
			System.out.print("Total cost is: " + dc.format(cost));
		}
	}

}
