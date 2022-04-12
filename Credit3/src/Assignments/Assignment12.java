package Assignments;

import java.util.Scanner;

public class Assignment12
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a grade percentage: ");
		int grade = input.nextInt();
		
		if (grade <= 100 && grade >=90)
		{
			System.out.print("The corresponding letter grade is: A+");
		}
		else if (grade <= 89 && grade >= 80)
		{
			System.out.print("The corresponding letter grade is: A");
		}
		else if (grade <=79 && grade >= 75)
		{
			System.out.print("The corresponding letter grade is: B+");
		}
		else if (grade <= 74 && grade >= 70)
		{
			System.out.print("The corresponding letter grade is: B");
		}
		else if (grade <= 69 && grade >= 65)
		{
			System.out.print("The corresponding letter grade is: C+");
		}
		else if (grade <= 64 && grade >= 60)
		{
			System.out.print("The corresponding letter grade is: C");
		}
		else if (grade <= 59 && grade >= 55)
		{
			System.out.print("The corresponding letter grade is: D+");
		}
		else if (grade <= 54 && grade >= 50)
		{
			System.out.print("The corresponding letter grade is: D");
		}
		else
		{
			System.out.print("The corresponding letter grade is: F");
		}
	}

}
/* Screen Dump

Enter a grade percentage: 75
The corresponding letter grade is: B+

*/