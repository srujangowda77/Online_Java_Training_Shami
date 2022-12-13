package JavaPackage;

public class Array2 {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		String b[] = {"hello","Ram","Priya","Oven"};
		Object c[] = { 9,8,7,6,5,4,"sumathi","rahul","om"};
		
		
		System.out.println("length of a array is "+a.length);
		System.out.println("Length of b array is "+ b.length);
		System.out.println("Length of c array is "+c.length);
		
		System.out.println(a[6]);
		System.out.println(b[3]);
		System.out.println(c[6]);
		
		c[6] = "Automation";
		System.out.println(c[6]);
		

	}

}
