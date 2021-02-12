package rsaEncryption;

import java.math.BigInteger;

public class Testing {

	public static void main(String[] args)
	{
		BigInteger bd = new BigInteger(""+119);
		BigInteger power = bd.pow(11);
		BigInteger rem = power.mod(new BigInteger("899"));
		
		System.out.println(power);
		System.out.println(rem.intValue());
	}

}
