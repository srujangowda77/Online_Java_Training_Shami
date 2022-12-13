package JavaPackage;

import java.util.Scanner;

public class SwappingUsingScanner 
{

	public static void main(String[] args)
	{
		System.out.println("Please eneter two values");
		Scanner scn = new Scanner(System.in);
		
		int x = scn .nextInt();
		int y = scn.nextInt();
		
		System.out.println("Values before swapping "+x +y);
		
		int temp = x;
		x=y;
		y=temp;
		
		System.out.println("Values after swapping"+x +y);
		
	}

}
