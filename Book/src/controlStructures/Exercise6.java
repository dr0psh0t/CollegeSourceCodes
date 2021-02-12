package controlStructures;
import java.util.Scanner;

public class Exercise6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int a, b, c, exact;
		
		System.out.print("Input a: ");
		a = console.nextInt();
		System.out.print("Input b: ");
		b = console.nextInt();
		System.out.print("Input c: ");
		c = console.nextInt();
		
		exact = ((int) Math.pow(a, 2) + (int) Math.pow(b, 2));
		//exact = (int) Math.pow(a + b, 2);
		System.out.printf("\nHypotenuse: %d", exact);
		
		if(c == exact)
			System.out.println("\nRight triangle");
		else
			System.out.println("\nNot right triangle");
	}
}