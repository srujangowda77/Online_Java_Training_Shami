package JavaPackage;

public class Static7 {
	
	String a;
	int b;
	static int c = 10;
	
	public static void a() {
		System.out.println("hello static");
		
	}
	
	public static void main(String[] args) {
		
		Static7 s7 = new Static7();
		
		s7.a= " Automation";
		s7.b = 7 ;
		
	a();
	System.out.println(s7.a+"    "+s7.b+"    "+c);
	}

}
