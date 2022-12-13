package JavaPackage;

public class MultiDimensionArray {

	public static void main(String[] args) {

		int a[][] = { { 4, 5, 6, 7 }, { 7, 8, 9, 4 }, { 1, 2, 3, 4 } };
		int row = a.length;
		int column = a[0].length;

		System.out.println("Row value is " + row);
		System.out.println("Columen value is " + column);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + "  ");

			}
			System.out.println();
		}
	}

}
