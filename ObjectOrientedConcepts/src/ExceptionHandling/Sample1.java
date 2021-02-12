package ExceptionHandling;
import java.util.*;

public class Sample1 
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
		catch(Exception eRef)
		{
			if(eRef instanceof ArithmeticException)
				System.out.println(eRef.toString());
			else if(eRef instanceof InputMismatchException)
			{
				String str = console.next();
				System.out.println(eRef.toString()+" "+str);
			}
		}
	}
}
