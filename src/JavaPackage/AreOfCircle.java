package JavaPackage;

import java.util.Scanner;

public class AreOfCircle {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number\n");
		int radius = scn.nextInt();
		
		double area = Math.PI*radius*radius;
		
		System.out.println("Area is "+area);
		
	}
}
