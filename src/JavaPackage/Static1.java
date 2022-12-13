package JavaPackage;

public class Static1 {

	int a = 5;
	String b = "hello";

	static int c = 10;

	public static void methoda() {
		int d = 15;
		
		System.out.println(d);
	}
		
	public void methodb()
	{
		String s = "automation";
		System.out.println(s);
		
			
	}
	
	public static void main(String[] args) {
		methoda();
		Static1 s1 = new Static1();
		s1.methodb();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(c);
		
		
	}
	}


