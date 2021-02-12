package warmUpOne;

/*
 * Given 2 int values, return whichever value is nearest to the value 10, 
 * or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number. 

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
public class CloseTen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloseTen ten = new CloseTen();
		System.out.print(ten.close10(8, 13));
	}

	public int close10(int a, int b) 
	{
		int incrementA = 0, incrementB = 0;
		
		if(a == b)
			return 0;
		else if(a == 10 && b == 10)
			return 0;
		else if(a == 10 || b == 10)
			return 10;
		else if(a < 10 && b < 10)
		{
			for(int x = a; x <= 10; x++)
				incrementA++;			
			for(int y = b; y <= 10; y++)
				incrementB++;
			
			if(incrementA == incrementB)
				return 0;
			else if(incrementA < incrementB)
				return a;
			else
				return b;
		}
		else if(a < 10 && b > 10)
		{
			for(int x = a; x <= 10; x++)
				incrementA++;
			for(int y = b; y >= 10; y--)
				incrementB++;
			
			if(incrementA == incrementB)
				return 0;
			else if(incrementA < incrementB)
				return a;
			else
				return b;
		}
		else if(a > 10 && b > 10)
		{
			for(int x = a; x >= 10; x--)
				incrementA++;
			for(int y = b; y >= 10; y--)
				incrementB++;
			
			if(incrementA == incrementB)
				return 0;
			else if(incrementA < incrementB)
				return a;
			else
				return b;
		}
		else if(a > 10 && b < 10)
		{
			for(int x = a; x >= 10; x--)
				incrementA++;
			for(int y = b; y <= 10; y++)
				incrementB++;
			
			if(incrementA == incrementB)
				return 0;
			else if(incrementA < incrementB)
				return a;
			else
				return b;
		}
		else
			return -1;
	}
}