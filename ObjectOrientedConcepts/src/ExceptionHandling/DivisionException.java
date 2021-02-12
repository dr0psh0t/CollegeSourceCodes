package ExceptionHandling;
import java.util.*;

public class DivisionException
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int dividend, divisor, quotient;		
		try
		{
			System.out.print("Enter dividend: ");
			dividend = console.nextInt();
			System.out.print("Enter divisor: ");
			divisor = console.nextInt();
			
			quotient = dividend / divisor;
			System.out.print("\nQuotient: "+quotient);
		}
		catch(ArithmeticException aeRef){
			System.out.print("Exception: "+aeRef.toString());
		}
		finally{
			System.out.print("Finally block reached.\n");
		}
	}
}

/*
Sample run:

Enter dividend: 9
Enter divisor: 0
Exception: java.lang.ArithmeticException: / by zero

Enter dividend: 6y
Exception: java.util.InputMismatchException 6y
*/