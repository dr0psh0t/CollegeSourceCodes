import java.util.*;

public class FizzBuzz 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("***** FIZZBUZZ *****\n");
		System.out.print("Input a number: ");
		int num = console.nextInt();
		
		fizzbuzz(num);
	}
	
	public static void fizzbuzz(int x)
	{
		if((x % 5 == 0) && (x % 3 == 0))
			System.out.print("FizzBuzz");
		else if((x % 3) == 0)
			System.out.print("Fizz");
		else if((x % 5) == 0)
			System.out.print("Buzz");
	}
}
