package chapterFive;

import java.util.Scanner;

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		double pi = 0;
		long i;
		long n;
		
		System.out.print("Enter the value of n: ");
		n = con.nextInt();
		
		System.out.println();
		
		for(i = 0; i < n; i++)
		{
			if(i % 2 == 0)
				pi = pi + (1 / (2 * i + 1));
			else
				pi = pi - (1 / (2 * i + 1));
			
			//pi = 4 * pi;
		}
		
		pi = 4 * pi;
		
		System.out.println("pi = "+pi);
		
		con.close();
	}
}