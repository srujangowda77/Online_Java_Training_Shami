package JavaPackage;

public class Inheritance4 extends Inheritance3 {

	public void multiply(int x , int y) {

		z = x * y;
		System.out.println("multiply"+z);
	}

	public static void main(String[] args) {
		
		int x= 10;
		int y = 5;
		
		Inheritance4 i4 = new Inheritance4();
		
		i4.add(x, y);
		i4.substract(x, y);
		i4.multiply(x, y);
		
		
		

	}

}
