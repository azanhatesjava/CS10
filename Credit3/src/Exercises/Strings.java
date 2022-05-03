package Exercises;

public class Strings 
{

	public static void main(String[] args) 
	{
		String txt = "Hello everybody";
		String firstName = "John ";
		String lastName = "Doe";
		
		System.out.println(txt.length());
		System.out.println(txt.toUpperCase());
		System.out.println(firstName + lastName);
		System.out.println(firstName.concat(lastName));
		System.out.println(txt.indexOf("e"));
	}

}
