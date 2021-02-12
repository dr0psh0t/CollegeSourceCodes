package romanNumerals;
import java.util.Scanner;

public class RomanTest 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
      
		System.out.print("Input Roman numerics: ");
		String romanNumber = console.next();

		Roman num = new Roman(romanNumber);		
		System.out.println(num.getDecimal());
	}
}

/*
Sample run:

Input Roman numerics: MMXIV
2014

*/