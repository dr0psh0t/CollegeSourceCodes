package ExceptionHandling;
import java.util.Scanner;

public class Sample4 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int lowerLimit, divisor, result = 0;
		try
		{
			System.out.print("Entering the try block.");
			
			System.out.print("\nEnter lowerLimit: ");
			lowerLimit = console.nextInt();
			System.out.print("Enter divisor: ");
			divisor = console.nextInt();
			
			result = lowerLimit / divisor;
			
			if(lowerLimit < 100)
				throw new Exception("Lower limit violation.");
			
			System.out.print("Exiting the try block");
			System.out.print("\nresult: "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Exception: "+e.getMessage());
			result = 110;
			System.out.print("\nresult: "+result);
		}
		catch(Exception e)
		{
			System.out.print("Exception: "+e.getMessage());
			System.out.print("\nresult: "+result);
		}
		System.out.print("\nAfter the catch block.");
	}
}

/*
Sample run:

Entering the try block.
Enter lowerLimit: 5
Enter divisor: 0
Exception: / by zero
result: 110
After the catch block.

Entering the try block.
Enter lowerLimit: 98
Enter divisor: 98
Exception: Lower limit violation.
result: 1
After the catch block.
 */
