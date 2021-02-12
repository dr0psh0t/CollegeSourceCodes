package defolt;
import static java.lang.System.*;
import java.util.Scanner;

public class CoffeeCup
{
	static Scanner console = new Scanner(in);
	public static void main(String[] args)
	{
		int n = console.nextInt();
		int count = 1,
				step = 1;
		
		double x = 0,
				y = 0,
				tempBW = 0,
				tempGC,
				c;
		
		if(n >= 1 && n <= 10)
		{
			while(count <= n)
			{
				out.print(step+" ");				
				if(step == 1)
				{
					tempBW = console.nextDouble();
					
					if(tempBW >= 1 && tempBW <= 100)
						x += tempBW;
				}
				else if(step == 2)
				{
					tempGC = console.nextDouble();
					
					if(tempGC >= 1 && tempGC <= 100)
						y += tempGC;
				}
				else
				{
					c = console.nextDouble();
					
					if(c >= 1 && c <= 100)
					{
						tempBW = (double) Math.round((x - c * x / (x + y)) * 10) / 10;
						tempGC = (double) Math.round((y - c * y / (x + y)) * 10) / 10;
						x = tempBW;
						y = tempGC;
					}
				}
				
				step++;
				if(step == 4)
					step = 1;
				count++;
			}
			out.println("\n"+(int)(100 * y / (x + y)));
		}
		else
			err.printf("%s is not in the range constraint", n);
	}	
}