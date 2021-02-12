package structure;

public class EvaluateExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3, b = 4, c = 5;
		int x, y;
		
		System.out.println("Initial values of the variables:");
		System.out.printf("a = %d\tb = %d\tc = %d\n\n", a, b, c);
		
		x = a * 4 + b / 2 - c * b;
		/*
		 * 3 * 4 + 4 / 2 - 5 * 4
		 * 12 + 2 - 20
		 * 14 - 20
		 * -6
		 */
		System.out.printf("Value of a * 4 + b / 2 - c * b: %d\n", x);
		
		y = --a * (3 + b) / 2 - c++ *b;
		/*
		 * 2 * 7 / 2 - 5 * 4
		 * 14 / 2 - 5 * 4
		 * 7 - 5 * 4
		 * 7 - 20
		 * -13
		 */
		System.out.printf("Value of --a * (3 + b) / 2 - c++ * b: %d", y);
		
		System.out.println("\n\nValues of the variables are now:");
		System.out.printf("a = %d\tb = %d\tc = %d\n\n", a, b, c);
	}

}
