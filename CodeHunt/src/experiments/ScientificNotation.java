package experiments;

public class ScientificNotation {

	public static void main(String[] args) {

		/*
		 * Which of the following are the same as 52.534?
		 * 5.2534e+1, 0.52534e+2, 525.34e-1, 5.2534e+0
		 * 
		 * 5.2534 x 10^1	= 52.534
		 * 0.52534 x 10^2	= 52.534
		 * 525.34 x 10^-1	= 52.534
		 * 5.2534 x 10^0	= 5.2534
		 */
		
		System.out.printf("%.4f\n", 5.2534e+1);
		System.out.printf("%.4f\n", 0.52534e+2);
		System.out.printf("%.4f\n", 525.34e-1);
		System.out.printf("%.4f\n", 5.2534e+0);
	}

}
