package newBook.chapter2;

public class NumericLiterals {

	public static void main(String[] args) {
		
		// Integer literals
		
		System.out.println(0B1111);
		System.out.println(07777);
		System.out.println(0B111111111111);
		System.out.println(0XFFFF);
		
		System.out.println();
		
		// Floating-point literals
		
		System.out.println(1.0 / 3.0);
		System.out.println(1.0F / 3.0F);
		
		System.out.println();
		
		// scientific notation
		System.out.println(1.23456E1);
		System.out.println(1.23456E+2);
		System.out.println(1.23456E3);
		System.out.println(1.23456E+4);
		System.out.println(1.23456E5);
		
		System.out.println();
		
		// underscore
		int ssn = 232_45_4519;
		long creditCardNumber =  2324_4545_4519_3415L;
		
		System.out.println("ssn = "+ssn);
		System.out.println("Credit card number = "+creditCardNumber);
		
		System.out.println();
		System.out.println(5 * Math.pow(5, 2 + 1));
	}

}