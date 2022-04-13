package Assignments;

import java.math.BigDecimal;
import java.util.Scanner;

public class Assignment13
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of copies to be printed: ");
		int copies = input.nextInt();
		
		if(copies >=0 && copies <= 99)
		{
			double cost = (copies*0.30);
			Math.round(cost);
			
			System.out.println("\nPrice per copy is: $0.30");
			System.out.print("Total cost is: " + cost);
		}
		else if(copies >=100 && copies <= 499)
		{
			double cost = (copies*0.28);
			Math.round(cost);
			
			System.out.println("\nPrice per copy is: $0.28");
			System.out.print("Total cost is: " + Math.round(cost));
		}
		else if(copies >=500 && copies <= 749)
		{
			double cost = (copies*0.27);
			Math.round(cost);
			
			System.out.println("\nPrice per copy is: $0.27");
			System.out.print("Total cost is: " + cost);
		}
		else if(copies >=750 && copies <= 1000)
		{
			double cost = (copies*0.26);
			Math.round(cost);
			
			System.out.println("\nPrice per copy is: $0.26");
			System.out.print("Total cost is: " + cost);
		}
		else
		{
			double cost = (copies*0.25);
			Math.round(cost);
			
			System.out.println("\nPrice per copy is: $0.25");
			System.out.print("Total cost is: " + cost);
		}
	}

}
