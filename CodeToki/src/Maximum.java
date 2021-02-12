import java.util.*;

public class Maximum 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Maximum m = new Maximum();
		int num, max = 0, x = 0, count = 0;
		
		System.out.print("Input numbers with ending with -99 to stop: \n");
		while(count != -99)
		{
			num = console.nextInt();
			if(num != -99)
			{
				max = m.maximum(num, x);
				x = max;
			}
			count = num;
		}
		System.out.print("Max: "+max);
	}
	
	public int maximum(int x, int y)
	{
		if(x >= y)
			return x;
		else
			return y;
	}
}
