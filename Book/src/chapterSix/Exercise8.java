package chapterSix;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner con = new Scanner(System.in);
		
		int x,
			y,
			z,
			a,
			b;
		
		System.out.print("Input x, y, z: ");
		x = con.nextInt();
		y = con.nextInt();
		z = con.nextInt();
		
		a = x * x + y * y;
		b = z * z;
		
		System.out.printf("%d = %d\n", a, b);
		
		if(a == b)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		con.close();
	}

}
