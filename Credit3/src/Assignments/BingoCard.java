package Assignments;

/*

Program: BingoCard.java          Date: 4/6/2022


Author: Azan Kamran 
School: CHHS
Course: Computer Science 10
 

*/

public class BingoCard
{

	public static void main(String[] args) 
	{
		String title = "B\tI\tN\tG\tO\n";
		System.out.println(title);
		
		int B1 = (int)(Math.random()*15+1);
		int B2 = (int)(Math.random()*15+1);
		int B3 = (int)(Math.random()*15+1);
		int B4 = (int)(Math.random()*15+1);
		int B5 = (int)(Math.random()*15+1);
		
		int I1 = (int)(Math.random()*15+16);
		int I2 = (int)(Math.random()*15+16);
		int I3 = (int)(Math.random()*15+16);
		int I4 = (int)(Math.random()*15+16);
		int I5 = (int)(Math.random()*15+16);
		
		int N1 = (int)(Math.random()*15+31);
		int N2 = (int)(Math.random()*15+31);
		int N3 = (int)(Math.random()*15+31);
		int N4 = (int)(Math.random()*15+31);
		int N5 = (int)(Math.random()*15+31);
		
		int G1 = (int)(Math.random()*15+46);
		int G2 = (int)(Math.random()*15+46);
		int G3 = (int)(Math.random()*15+46);
		int G4 = (int)(Math.random()*15+46);
		int G5 = (int)(Math.random()*15+46);
		
		int O1 = (int)(Math.random()*15+61);
		int O2 = (int)(Math.random()*15+61);
		int O3 = (int)(Math.random()*15+61);
		int O4 = (int)(Math.random()*15+61);
		int O5 = (int)(Math.random()*15+61);
		
		System.out.print(B1 + "\t" + I1 + "\t" + N1 + "\t" + G1 + "\t" + O1 + "\n\n");
		System.out.print(B2 + "\t" + I2 + "\t" + N2 + "\t" + G2 + "\t" + O2 + "\n\n");
		System.out.print(B3 + "\t" + I3 + "\t" + N3 + "\t" + G3 + "\t" + O3 + "\n\n");
		System.out.print(B4 + "\t" + I4 + "\t" + N4 + "\t" + G4 + "\t" + O4 + "\n\n");
		System.out.print(B5 + "\t" + I5 + "\t" + N5 + "\t" + G5 + "\t" + O5);
	}

}
/* Screen Dump
 * 
 B	I	N	G	O

2	25	32	50	65

6	27	42	48	66

8	28	43	56	74

14	29	39	52	75

5	26	41	53	72

*/
