package JavaPackage;

public class DefualtConstructorOverload {
	
	
	DefualtConstructorOverload()
	{
		
		System.out.println("DefualtConstructorOverload is happened ");
		
		
		
	}
	
	DefualtConstructorOverload(int a)
	{
		
		System.out.println("Print the valie of A"+a);
		
	}
	
	
	DefualtConstructorOverload(String name)
	
	{
		System.out.println("Srtring value is "+name);
		
	}
	
	
	public static void main(String[] args) {
		
		
		DefualtConstructorOverload dc1 = new DefualtConstructorOverload();
		DefualtConstructorOverload dc2 = new DefualtConstructorOverload(5);
		DefualtConstructorOverload dc3 = new DefualtConstructorOverload("srujan");
		
		
		
		
	}

}
