package ExceptionHandling;
import java.util.Scanner;

public class Sample3
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int lowerLimit;
		try
		{
			System.out.print("Entering the try block.");
			System.out.print("\nInput lower limit: ");
			lowerLimit = console.nextInt();
			
			if(lowerLimit < 100)
				throw new LowerLimitViolationException();
			
			System.out.print("Exiting the try block");
		}
		catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}
	}
}

/*
Sample run:

Entering the try block.
Input lower limit: 98
Exception: Lower limit violation. 
 */
