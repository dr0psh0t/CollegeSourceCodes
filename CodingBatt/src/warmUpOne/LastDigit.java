package warmUpOne;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LastDigit l = new LastDigit();
		
		System.out.print(l.lastDigit(7, 17)+"\n");
		System.out.print(l.lastDigit(6, 17)+"\n");
		System.out.print(l.lastDigit(3, 113));
	}

	public boolean lastDigit(int a, int b)
	{
		int remA, remB;
		
		if(a == b)
			return true;
		else if(a >= 10 && b >= 10)
		{
			remA = a % 10;
			remB = b % 10;
			
			if(remA == remB)
				return true;
			else
				return false;
		}
		else if(a < 10 && b >= 10)
		{
			remB = b % 10;
			
			if(a == remB)
				return true;
			else
				return false;
		}
		else if(a >= 10 && b < 10)
		{
			remA = a % 10;
			
			if(remA == b)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}