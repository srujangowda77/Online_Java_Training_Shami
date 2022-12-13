package JavaPackage;

public class RelationalOperator {

	public static void main(String[] args) {
		
		String p = "SRUJAN";
		String q = "srujan";
		
		if(p==q)
		{
			System.out.println("p is equal to q");
						
		}
		else
		{
			System.out.println("p is not equal to q");
		}
		
		if(p.equals(q))
		{
			System.out.println("p is equal to q");
						
		}
		else
		{
			System.out.println("p is not equal to q");
		}
		
		if(p.equalsIgnoreCase(q))                         //Not case sensitive 
		{
			System.out.println("p is equal to q");
						
		}
		else
		{
			System.out.println("p is not equal to q");
		}

	}

}
