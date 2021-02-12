package chapterSix;

import java.util.Scanner;

public class Exercise2
{
	public static void main(String[] args)
	{
		int seconds,
			minutes,
			hours,
			days,
			week,
			year;
		
		Scanner con = new Scanner(System.in);
		
		System.out.print("Enter seconds: ");
		seconds = con.nextInt();
		
		year = seconds / (3600 * 24 * 365);
		week = seconds / (3600 * 24 * 7);
		days = seconds / (3600 * 24);
		hours = seconds / 3600;
		minutes = seconds % 3600 / 60;
		seconds = seconds % 3600 % 60;
		
		System.out.printf("%d years %d weeks %d days %d hrs %d minutes %d seconds",
				year, week, days, hours, minutes, seconds);
		
		con.close();
	}
}