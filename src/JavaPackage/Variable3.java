package JavaPackage;

public class Variable3 {
	
	int a = 100;    // Global variable 
	static int data = 30;  // static variable

	public static void main(String[] args) 
	{

		int b = 50;
		
		System.out.println(b);
		a();
		Variable3 v4 = new Variable3();
		System .out.println(c);

	}
	
	static int c = 100;      // static variable 
	
	public static void a()
	{
	  int d = 200;
	  System.out.println(d);
	}

}
