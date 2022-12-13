package JavaPackage;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
	
		double a = 5.9;
		
		System.out.println("double value is "+a);
		
		int b = (int)a;
		
		System.out.println("Interger valus is "+b);
		
		String c = "52";
		
		System.out.println("character value is"+c);
		
		int d = Integer.parseInt(c);
		
		System.out.println("Interger value is"+d);

		
		String e = String.valueOf(b);
		System.out.println("string value is"+e);
	}

}
