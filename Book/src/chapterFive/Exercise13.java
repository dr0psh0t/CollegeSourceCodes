package chapterFive;

import java.util.Scanner;

public class Exercise13
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		double populationA,
				populationB;
		
		double growthRateA,
				growthRateB;
		
		System.out.print("Population of town A: ");
		populationA = con.nextInt();
		
		System.out.print("Growth rate of town A: ");
		growthRateA = con.nextInt();
		growthRateA /= 100;
		
		System.out.print("Population of town B: ");
		populationB = con.nextInt();
		
		System.out.print("Growth rate of town B: ");
		growthRateB = con.nextInt();
		growthRateB /= 100;
		
		int year = 1;
		boolean surpassed = false;
		
		while(!surpassed)
		{
			populationA += (populationA * growthRateA);
			populationB += (populationB * growthRateB);
			
			if(populationA >= populationB)
				surpassed = true;
			
			++year;
		}
		
		System.out.printf("\nIn %d years, the population of town A is %d and town B is %d",
				year, (int) populationA, (int) populationB);
		
		con.close();
	}
}