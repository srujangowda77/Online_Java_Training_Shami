package JavaPackage;

public abstract class Abstract1 {
	
	static int a = 10;
	int b = 5;
	
	final int c = 15;
	
	//defualt constructor
	Abstract1()
	{
		
		System.out.println("Defualt abstract constructor");
		
	}
	
	// Abstract Method 
	 abstract void eat();
	
	
	 
	 public void a()
	 {
		 
		 System.out.println("Non abstract Method ");
	 }

}
