package JavaPackage;

public class MethodOveride2 extends MethodOveride1 {

	
	public void eat()
	{
		System.out.println("Printing Applie");

	}
	
	public static void main(String[] args)
	{
		MethodOveride1 m1 = new MethodOveride1();
		m1.eat();
		

	}

}
