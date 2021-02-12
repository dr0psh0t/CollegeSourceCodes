package ExceptionHandling;
import java.util.Scanner;

public class Sample5 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			System.out.print("Entering the try block.");
			int result = result();
			
			System.out.print("\nExiting the try block");
			System.out.print("\nresult: "+result);
		}
		catch(Exception ex){
			System.out.print("Exception: "+ex.getMessage());
		}
		finally{
			System.out.print("Finally block reached.");
		}
	}
	
	public static int result() throws ArithmeticException, Exception
	{
		int lowerLimit, divisor;
		
		try
		{
			System.out.print("\nInput lowerLimit: ");
			lowerLimit = console.nextInt();
			System.out.print("Input divisor: ");
			divisor = console.nextInt();
			
			if(divisor == 0)
				throw new ArithmeticException("Cannot divide integer by zero.");
			
			if(lowerLimit < 100)
				throw new Exception("Lower limit violation.");
			
			return lowerLimit / divisor;
		}
		catch(ArithmeticException e){
			throw e;
		}
		catch(Exception ex){
			throw ex;
		}
	}
}

/*
Entering the try block.
Input lowerLimit: 5
Input divisor: 0
Exception: Lower limit violation.

Entering the try block.
Input lowerLimit: 98
Input divisor: 98
Exception: Lower limit violation.
*/
