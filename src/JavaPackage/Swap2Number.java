package JavaPackage;

import java.util.Scanner;

public class Swap2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number\n");
		int a = scn.nextInt();
		System.out.println("Enter second number");
		int b = scn.nextInt();
		System.out.println("before swapping " + a + "  " + b);
		int temp = a;
		a = b;
		b = temp;

		System.out.println("after swapping " + a + "  " + b);
	}

}
