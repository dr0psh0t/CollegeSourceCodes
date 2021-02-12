package chapterFive;

import java.util.Scanner;

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		int num,
			sum = 0,
			tens = 1,
			digits = 0;
		
		System.out.print("Enter a number: ");
		num = con.nextInt();
		
		num = Math.abs(num);
		
		int temp = num;
		
		while(temp > 0)
		{
			temp = temp / 10;
			tens *= 10;
			++digits;
		}
		
		tens /= 10;
		
		while(digits > 0)
		{
			System.out.print((num / tens) % 10+" ");
			sum = sum + (num / tens) % 10;
			tens /= 10;
			--digits;
		}
		
		System.out.printf("\nsum = %d", sum);
		
		con.close();
	}
}