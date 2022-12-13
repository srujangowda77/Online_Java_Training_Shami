package JavaPackage;

public class ParamaterizedConstructor {
	
	
	int a;
	String name;
	String address;
	
	ParamaterizedConstructor()
	{
		
		System.out.println("Defualt constructor");
		
	}
   
	
	ParamaterizedConstructor(int c , String b, String d)
	{
		this.a = c;
		name = b;
		address = d;
	}
	
	
	public void getResult()
	{
		System.out.println("value of a is "+a+"  Value of name is "+name+"  Value of addresss"+address );
	}
	
	public static void main(String[] args) {
		
		
		ParamaterizedConstructor pc = new ParamaterizedConstructor();
		
		ParamaterizedConstructor pc1 = new ParamaterizedConstructor(2, "  srujan", "  automation");
		pc1.getResult();
		ParamaterizedConstructor pc2 = new ParamaterizedConstructor(10, "  rahul", "  cat");
		pc2.getResult();
	}
}
