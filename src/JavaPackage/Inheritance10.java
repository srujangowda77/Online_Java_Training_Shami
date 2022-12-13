package JavaPackage;

public class Inheritance10 extends Inheritance8 {
	
	public void shift()
	{
		System.out.println("shift");
	}

	
	public static void main(String[] args) {
		
		Inheritance10 i10 = new Inheritance10();
		
		i10.eat();
		i10.shift();
	}
}
