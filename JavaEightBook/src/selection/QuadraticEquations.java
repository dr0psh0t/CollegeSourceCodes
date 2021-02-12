package selection;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		double a, b, c,
			discriminant;
		
		System.out.print("Enter a, b, c: ");
		
		a = con.nextDouble();
		b = con.nextDouble();
		c = con.nextDouble();
		
		discriminant = Math.pow(b, 2) - 4 * a * c;
		
		if(discriminant > 0)
		{
			double r1, r2;
			
			r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			
			System.out.printf("The equation has two roots %f and %f", r1, r2);
		}
		else if(discriminant == 0)
			System.out.print("The equation has one root "+(-b / (2 * a)));
		else
			System.out.print("The equation has no real roots");
		
		con.close();
	}

}
