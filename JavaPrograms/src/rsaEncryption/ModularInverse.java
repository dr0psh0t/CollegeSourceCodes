package rsaEncryption;

public class ModularInverse
{
	public static void main(String[] args)
	{
		int d = 1;
		int t = 840;
		int e = 11;
		int rem;

		while(true)
		{
			rem = (d * e) % t;

			if(rem == 1)
				break;

			d++;
		}

		System.out.println("Modular Inverse is: "+d);
	}
}