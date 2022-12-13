package JavaPackage;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the vale of a ");
	int a= scn.nextInt();
	System.out.println("enter the value of b");
	int b = scn.nextInt();
	
	if (a < b)
	{
		System.out.println("a is less than b ");
	}
	else if(b > a)
	{
		System.out.println("b is greater than b");
	}
	else
	{
		System.out.println("Both are equal ");
	}


}
}