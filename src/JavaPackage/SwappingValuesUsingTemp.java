package JavaPackage;

public class SwappingValuesUsingTemp 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("Numbers Before swapping" +a +b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Numbers after swapping" +a +b);

	}

}
