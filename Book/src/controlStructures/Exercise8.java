package controlStructures;
import java.util.Scanner;

public class Exercise8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		int a, b, c,
		discriminant;
		
		System.out.print("Input coefficient of x^2: ");
		a = console.nextInt();
		System.out.print("Input coefficient of x: ");
		b = console.nextInt();
		System.out.print("Input constant term: ");
		c = console.nextInt();
		
		discriminant = (int) ((Math.pow(b, 2)) - 4 * (a * c));
		
		System.out.printf("\ndiscriminant: %d", discriminant);
		
		if(discriminant == 0)
			System.out.print("\nSingle root");
		else if(discriminant > 0)
			System.out.print("\nTwo real roots");
		else
			System.out.print("\nTwo complex roots");
		
		if(discriminant >= 0)
		{
			double x, y;
			x = ((-b) + Math.sqrt(discriminant))  / (2 * a);
			y = ((-b) - Math.sqrt(discriminant))  / (2 * a);
			
			System.out.printf("\nOne root: %.3f", x);
			System.out.printf("\nOther root: %.3f", y);
		}
	}
}