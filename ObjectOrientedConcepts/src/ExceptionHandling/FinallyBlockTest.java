package ExceptionHandling;
import java.util.*;

public class FinallyBlockTest 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		try
		{
			System.out.print("Input number: ");
			short num = console.nextShort();
			
			System.out.print("you inputted: "+num);
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		finally{
			System.out.println("\nFinally block reached!");
		}
	}
}

/*
Sample run:

Input number: p
java.util.InputMismatchException

Finally block reached!
	at java.util.Scanner.throwFor(Unknown Source)
	at java.util.Scanner.next(Unknown Source)
	at java.util.Scanner.nextShort(Unknown Source)
	at java.util.Scanner.nextShort(Unknown Source)
	at ExceptionHandling.FinallyBlockTest.main(FinallyBlockTest.java:14)
 */