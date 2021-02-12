package rsaEncryption;

import java.math.BigInteger;

public class RSADecryption
{
	public static void main(String[] args)
	{
		int[] cipherText = new int[] {595, 741, 446, 635, 671};
		int d = 611;
		int n = 899;
		
		System.out.println(decrypt(cipherText, d, n));
	}
	
	public static String decrypt(int[] cipherText, int d, int n)
	{
		int len = cipherText.length;
		int M;
		
		StringBuilder sBuilder = new StringBuilder();
		
		for(int x = 0; x < len; ++x)
		{
			BigInteger bd = new BigInteger(""+cipherText[x]);
			BigInteger power = bd.pow(d);
			BigInteger remainder = power.mod(new BigInteger(""+n));
			
			M = remainder.intValue();
			sBuilder.append(Character.toString((char) M));	// ascii value to char
		}
		
		return sBuilder.toString();
	}
}