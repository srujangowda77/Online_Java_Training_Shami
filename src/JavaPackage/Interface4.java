package JavaPackage;

public class Interface4 extends Encapsulation2 implements Interface3,Interface1

{



	public void a() {
		System.out.println("Print a");
		
	}

	
	public static void main(String[] args) {
		

		
		Interface4 i4 = new Interface4();
		
		i4.a();
		i4.b();
		i4.getResult();
	}


	
	public void b() {
		// TODO Auto-generated method stub
		
	}
}
