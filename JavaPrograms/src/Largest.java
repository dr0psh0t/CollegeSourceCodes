import java.util.*;

public class Largest 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int max = 0, num, count = 0;
	//	int numm = 0;
		
		System.out.print("Input 5 numbers: \n");
		while(count <= 4)
		{
			num = console.nextInt();
			max = largest(num, max);
			count++;
		}
	/*	System.out.print("x = ");
		int x = console.nextInt();
		System.out.print("\ny = ");
		int y = console.nextInt();
		int max = largest(x, y); */
		System.out.print("\nlargest = "+max);
	}
	
	public static int largest(int first, int second)
	{
		if(first > second)
			return first;
		else
			return second;
	}
}
