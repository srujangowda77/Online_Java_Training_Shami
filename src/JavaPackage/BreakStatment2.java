package JavaPackage;

public class BreakStatment2 {

	public static void main(String[] args) {
		
		for (int i =0; i<3; i++)
		{
			for (int j = 1;j<3;j++)
			{
				if (i==2 && j==2)
				{
					break;
				}
				System.out.println(i+ "  " +j);
			}
			System.out.println("outer body loop");
		}

	}

}
