package JavaPackage;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
	
		System.out.println("Enter the number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int rev = 0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num= num/10;
			
		}
		
	System.out.println("reversed number is "+rev);
	}

}
