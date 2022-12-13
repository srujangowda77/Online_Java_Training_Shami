package JavaPackage;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter number");
		
		int a = scn.nextInt();
		
		if ((a%2)==0)
		{
			System.out.println("Number is even ");
			
		}
		
		else 
			
		{
			System.out.println("odd number");
		}

	}

}
