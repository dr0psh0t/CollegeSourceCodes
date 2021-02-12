package introduction;
import java.util.Scanner;

public class AreaAndCircumference {
	
	final static float PI = 3.1416f;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner con = new Scanner(System.in);
		
		float circ;
		float area;
		float radius;
		
		System.out.print("Enter the value of the radius: ");
		radius = con.nextFloat();
		
		circ = 2 * PI * radius;
		area = PI * radius * radius;
		
		System.out.printf("\nRadius is: %10.2f", radius);
		System.out.printf("\nCircumference: %.2f", circ);
		System.out.printf("\nArea is: %10.2f", area);
	}

}
