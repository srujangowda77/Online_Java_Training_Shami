package JavaPackage;

public class Encapsulation1 {
	
	String name;
	int b;
	final int c = 5;
	
	public void setName(String a)
	{
		
		this.name = a;
		this.b = 10;
		
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public Object getResult()
	{
		return name;
		
	}

}
