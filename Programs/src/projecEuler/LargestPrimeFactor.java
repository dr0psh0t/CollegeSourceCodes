package projecEuler;

import java.util.Scanner;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * http://www.calculatorsoup.com/calculators/math/prime-factors.php
 */

public class LargestPrimeFactor
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		System.out.print("Number: ");
		double num = con.nextDouble();
		con.close();
		
		int largestFactor = 0;
		
		int x = 2;
		while(num > 1)
		{
			if((num % x) == 0)
			{
				System.out.println(x);
				largestFactor = bigger(largestFactor, x);
				num = num / x;
			}
			else
				++x;
		}
		System.out.println("Largest prime factor: "+largestFactor);
	}
	
	public static int bigger(int g, int h)
	{
		if(g == h)
			return g;
		else if(g > h)
			return g;
		else
			return h;
	}
	
	public static boolean isPrime(double num)
	{
		for(int g = 2; g < num - 1; ++g)
		{
			if((num % g) == 0)
				return false;
		}
		return true;
	}
}