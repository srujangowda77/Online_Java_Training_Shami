package JavaPackage;

import java.util.Scanner;

public class MethodOverload7 {

	public static void add(int a, int b)

	{

		System.out.println(a + b);

	}

	public static void add(int a, int b, int c)

	{

		System.out.println(a * b * c);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		{

			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();

			add(c, d);
			add(c, d, e);

		}

	}
}