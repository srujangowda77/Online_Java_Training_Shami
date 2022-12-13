package JavaPackage;

public class MethodOveride4 extends MethodOveride3 {
	
	public void run() {
		
		System.out.println(" iam not eating ");
	}

	public static void main(String[] args) {
		
		
		MethodOveride4 m1 = new MethodOveride4();
		
		m1.run();
		
		MethodOveride3 m2 = new MethodOveride3();
		
		m2.run();
	}

}
