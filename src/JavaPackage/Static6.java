package JavaPackage;

public class Static6 {

	static int x = 10;
	int y = 15;

	public void a() {
		int z = 10;
		System.out.println(z);

	}

	static int b = 6;

	public static void b() {

		int a = 5;
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println(x);
		b();
		Static6 s6 = new Static6();
		System.out.println(s6.y);
		System.out.println(s6.b); // Not approprriate way 
		System.out.println(Static6.b); // Appropraite way
		System.out.println(b);

	}
}
