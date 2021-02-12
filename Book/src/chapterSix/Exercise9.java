package chapterSix;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner con = new Scanner(System.in);
		
		int num,
			temp,
			base,
			newBase,
			tempBase = 0,
			tens = 1,
			digits = 0,
			power;
		
		System.out.print("Enter a number: ");
		num = con.nextInt();
		
		System.out.print("Enter base: ");
		base = con.nextInt();
		
		System.out.print("Enter new base: ");
		newBase = con.nextInt();
		
		temp = num;
		
		while(temp > 0)
		{
			temp /= 10;
			tens *= 10;
			++digits;
		}
		
		tens /= 10;
		power = digits - 1;
		
		while(digits > 0)
		{
			tempBase += (num / tens) % 10 * (int) Math.pow(base, power);
			tens /= 10;
			--digits;
			--power;
		}
		
		System.out.printf("\nbase = %d", tempBase);
		
		StringBuilder sBuilder = new StringBuilder();
		
		while(tempBase > 0)
		{
			sBuilder.append(tempBase % newBase);
			tempBase /= newBase;
		}		
		
		System.out.printf("\nnew base = %d", Integer.parseInt(sBuilder.reverse().toString()));
		
		con.close();
	}

}
