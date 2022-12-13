package JavaPackage;

public class UnaaryOperator3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a++);      //10
		System.out.println(a++ + ++a); // 24
		System.out.println(a + a++); // 26
		System.out.println(b++ + b--);//21
		System.out.println(b++ + b--);//21
		System.out.println(b);//10

	}

}
