package rsaEncryption;

import java.math.BigInteger;
import java.util.Scanner;

public class RSAEncryption
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		int p, q, n, t, e, d;
		
		//	1.	GENERATING A PUBLIC KEY AND PRIVATE KEY
		
		// generate 2 prime numbers:
		p = 29;
		q = 31;
		
		// calculate n:
		n = p * q;
		
		// calculate t:
		t = (p - 1) * (q - 1);
		
		/* choose prime number e. e needs to be relatively prime to t.
		 * (t cannot be divisible by e) Lets pick 11.
		 */
		e = 11;
		
		/* find the d. we will use the formula: d * e [=] 1 mod t.
		 * this means (d * 11) / t will give us a remainder of 1. you have to find the
		 * inverse of e mod t.
		 */
		d = getD(e, t);
		
		
		/* we now have everything we need for a private and public key to encrypt our data.
		 * 
		 * public key becomes n and e
		 * private key becomes n and d
		 */
		
		
		System.out.print("Enter your message: ");
		String message = con.next();
		
		
		//	2.	ENCRYPTING OUR MESSAGE
		int[] cipherText = getCipherText(message, e, n);
		
		System.out.print("\nCipher Text: ");
		
		for(int num : cipherText)
		{
			System.out.print(num+" ");
		}
		
		System.out.printf("\n\npublic key %d and %d", n, e);
		System.out.printf("\nprivate key %d and %d", n, d);
		
		con.close();
	}
	
	public static int[] getCipherText(String message, int e, int n)
	{
		int length = message.length();
		int[] cipherText = new int[length];
		int m;	// ascii value of a char
		
		for(int x = 0; x < length;  ++x)
		{
			m = (int) message.charAt(x);
			
			BigInteger bd = new BigInteger(""+m);
			BigInteger power = bd.pow(e);
			BigInteger remainder = power.mod(new BigInteger(""+n));		// the encrypted message per character in a string
			
			cipherText[x] = remainder.intValue();
		}
		
		return cipherText;
	}
	
	public static int getD(int e, int t)
	{
		int d = 1, rem;
		
		while(true)
		{
			rem = (d * e) % t;
			
			if(rem == 1)
				return d;
			
			++d;
		}
	}
}