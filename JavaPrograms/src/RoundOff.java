
import java.util.*;

public class RoundOff 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			double decimal;
			int choice;
			
			System.out.print("Input decimal number to round off: ");
			decimal = console.nextDouble();
			System.out.println();
			
			System.out.print("Press: 1 = Lowest or 2 = Largest: ");
			choice = console.nextInt();
			System.out.println();
			
			if(choice == 1)
				System.out.print(roundLowest(decimal));
			else if(choice == 2)
				System.out.print(roundLargest(decimal));
			else
				System.out.print("Choice did not exist!. Try again.");
		}
		catch(Exception e)
		{
			System.out.print("Input Error, try again.");
		}
	}
	
	public static double roundLowest(double decimal)
	{
		if(decimal == 0)
			return 0;
		else
		{
			double num = 0;
			
			for(double i = 0; i <= decimal; i++)
				num = i;
			
			return num;
		}
	}
	
	public static double roundLargest(double decimal)
	{
		if(decimal == 0)
			return 0;
		else
		{
			double num = 0;
			
			for(double i = 0; i < decimal; i++)
				num = i;

			return num + 1.0;
		}
	}
}
