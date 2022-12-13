package JavaPackage;

public class MethodOverlaod1 {
	
	
	public static void methoda(int a , int b , int c)
	
	{
		int x = a*b*c;
		System.out.println("Multiply is"+x);
	}
	
	public static void methoda(int a, int b)
	{
		
		int y = a+b;
		
		System.out.println("Addition is "+y);
	}

}
