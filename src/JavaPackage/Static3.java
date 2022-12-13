package JavaPackage;

public class Static3 {

	int roll;
	String name;
	static String College = "IIT bombay";

	Static3 (int r, String s) {
		roll = r;
		name = s;
	}

	public void getResult() {
		System.out.println(roll + "  " + name + "  " + College);
	}

}
