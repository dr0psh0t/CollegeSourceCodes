package warmUpOne;

public class Max1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Max1020 max = new Max1020();
		
		System.out.print(max.max1020(11, 19)+"\n");
		System.out.print(max.max1020(19, 11)+"\n");
		System.out.print(max.max1020(11, 9));
	}

	public int max1020(int a, int b)
	{
		if(a == b)
		{
			if(a >= 10 && a <= 20)
				return a;
			else
				return 0;
		}
		else if(a > b)
		{
			if(a >= 10 && a <= 20)
				return a;
			else if(b >= 10 && b <= 20)
				return b;
			else
				return 0;
		}
		else
		{
			if(b >= 10 && b <= 20)
				return b;
			else if(a >= 10 && a <= 20)
				return a;
			else
				return 0;
		}
	}
}
