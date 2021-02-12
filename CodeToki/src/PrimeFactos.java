import java.util.*;

public class PrimeFactos 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{	
		System.out.print("Input a number: ");
		int num = console.nextInt();
		
		primeFactors(num);
	}
	
	public static void primeFactors(int n)
	{
		int i = 2;
		while(n > 1)
		{
			if(n % i == 0)
		    {
				System.out.print(i+" ");
				n = n / i;
		    }
			else
				i++;
		}
	}
}
