package JavaPackage;

public class Array1 {

	public static void main(String[] args) {
// Initializing of array 
		int a[] = new int[5];

		// Print defualt value of array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Defining array
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		// a[5] = 56 array index is out of scope

		System.out.println(a[2]);

		// print length of array
		System.out.println(a.length);

		// print array element values

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
