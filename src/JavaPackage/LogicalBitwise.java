package JavaPackage;

public class LogicalBitwise {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		System.out.println(a<b && a++ < b);//
		System.out.println(a);//10
		System.out.println(a<b & a++ < b);//
		System.out.println(a);//11

	}

}
