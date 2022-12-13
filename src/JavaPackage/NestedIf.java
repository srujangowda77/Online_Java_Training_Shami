package JavaPackage;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 49;
		int weight = 59;
		if (age <= 50)
		{
			if ( weight >= 60)
			{
				System.out.println("he is selected ");
					
			}
			else 
			{
				System.out.println("he is not selected weight is less ");
			}
		}
		else
		{
			System.out.println("he is not selected age is more than 60");
		}

	}

}
