package JavaPackage;

import java.util.Scanner;

public class Generate5Integer {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a value");
		int a= scn.nextInt();
		for(int i= a; i< 10; i++)
		{
			
			System.out.println(i);
		}
		scn.close();
	}

}
