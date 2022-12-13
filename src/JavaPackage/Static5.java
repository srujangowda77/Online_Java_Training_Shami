package JavaPackage;

public class Static5 {

	static int z = 5; // static method
	int y = 10; // Global variabale

	// Static method
	public static void a() {
		int z = 10;
		System.out.println(z);

	}

	// Non - static Method
	public void b() {
		int z = 15;
		System.out.println(z);

		a();

	}

	public static void main(String[] args) {
		a();
		Static5 s5 = new Static5();
		s5.b();

	}
}
