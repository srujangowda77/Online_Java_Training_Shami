package JavaPackage;

public class Interface2 implements Interface1 {

	
	public void b() {
	
		
		System.out.println("a method");
	}

	
	public static void main(String[] args) {
		Interface2 i2 = new Interface2();
		i2.b();
		
	}
}
