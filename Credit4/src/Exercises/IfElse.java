package Exercises;

public class IfElse 
{

	public static void main(String[] args) 
	{
		int x = 50;
		int y = 10;
		int z = 50;
		int time = 20;
		
		if (x > y) 
		{  
			System.out.println("Hello World");
		}
		if (x == z)
		{
			System.out.println("Hello World");
		}
		if (x == y)
		{
			System.out.println("1");
		}
		else if (x > y)
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("3");
		}
		
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
	}

}
