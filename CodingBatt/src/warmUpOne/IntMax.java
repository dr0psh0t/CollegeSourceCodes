package warmUpOne;
/*

Given three int values, a b c, return the largest. 

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
public class IntMax 
{
	public static void main(String[] args) 
	{
		IntMax me = new IntMax();
		System.out.print(me.intMax(3, 2, 4));
	}
	
	public int intMax(int a, int b, int c) 
	{
		if(a >= b && a >= c)
			return a;
		else if(b >= a && b >= c)
			return b;
		else if(c >= a && c >= b)
			return c;
		else
			return b;
	}
}
