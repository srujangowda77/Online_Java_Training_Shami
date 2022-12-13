package JavaPackage;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number\n");
		int a = scn.nextInt();
		System.out.println("Enter second number");
		int b = scn.nextInt();
		
		int sum = a + b;
		
		float avg =((a+b)/2);
		
		System.out.println("Sum is "+sum+"\naverage is "+avg);
	}
}
