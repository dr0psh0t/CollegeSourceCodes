package accenture;
import java.util.Scanner;

public class Fibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		int max;
		System.out.print("Enter max: ");
		max = console.nextInt();
		
		//fibLoop(max);
		for(int i = 1; i <= max; i++)
			System.out.print(fibRec(i) +" ");
	}
	
	public static int fibRec(int number)
	{
		if(number == 1 || number == 2)
            return 1;
		else
			return fibRec(number-1) + fibRec(number -2);
	}
	
	public static void fibLoop(int max)
	{
		int a = 0, b = 1, c = a + b;
		
		System.out.print(a+" "+b+" ");
		for(int x = 1; x <= max - 2; x++)
		{
			System.out.print(c+" ");
			a = b;
			b = c;
			c = a + b;
		}
	}
}
