import java.util.*;

public class Zodiac 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int day, month;
		
		System.out.print("Input birth month: ");
		month = console.nextInt();
		System.out.print("Input your birth date: ");
		day = console.nextInt();
		System.out.print("\n");
		
		if(!(month <= 0) && !(month >= 13))
		{
			if(month == 1)
			{
				System.out.print("January "+day+" = ");
				if(day > 0 && day <= 31)
				{
					if(day >= 1 && day <= 20)
						System.out.print("Capricorn");
					else if(day >= 21 && day <= 31)
						System.out.print("Aquarius");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 2)
			{
				if(day > 0 && day <= 29)
				{
					System.out.print("February "+day+" = ");
					if(day >= 1 && day <= 19)
						System.out.print("Aquarius");
					else if(day >= 20 && day <= 29)
						System.out.print("Pisces");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 3)
			{
				if(day > 0 && day <= 31)
				{	
					System.out.print("March "+day+" = ");
					if(day >= 1 && day <= 20)
						System.out.print("Pisces");
					else if(day >= 21 && day <= 31)
						System.out.print("Aries");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 4)
			{
				if(day > 0 && day <= 30)
				{
					System.out.print("April "+day+" = ");
					if(day >= 1 && day <= 20)
						System.out.print("Aries");
					else if(day >= 21 && day <= 30)
						System.out.print("Taurus");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 5)
			{
				if(day > 0 && day <= 31)
				{
					System.out.print("May "+day+" = ");
					if(day >= 1 && day <= 21)
						System.out.print("Taurus");
					else if(day >= 22 && day <= 31)
						System.out.print("Gemini");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 6)
			{
				if(day > 0 && day <= 30)
				{
					System.out.print("June "+day+" = ");
					if(day >= 1 && day <= 21)
						System.out.print("Gemini");
					else if(day >= 22 && day <= 30)
						System.out.print("Cancer");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 7)
			{
				if(day > 0 && day <= 31)
				{
					System.out.print("July "+day+" = ");
					if(day >= 1 && day <= 22)
						System.out.print("Cancer");
					else if(day >= 23 && day <= 31)
						System.out.print("Leo");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 8)
			{
				if(day > 0 && day <= 31)
				{
					System.out.print("August "+day+" = ");
					if(day >= 1 && day <= 22)
						System.out.print("Leo");
					else if(day >= 23 && day <= 31)
						System.out.print("Virgo");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 9)
			{
				if(day > 0 && day <= 30)
				{
					System.out.print("September "+day+" = ");
					if(day >= 1 && day <= 23)
						System.out.print("Virgo");
					else if(day >= 24 && day <= 30)
						System.out.print("Libra");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 10)
			{
				if(day > 0 && day <= 31)
				{
					System.out.print("October "+day+" = ");
					if(day >= 1 && day <= 23)
						System.out.print("Libra");
					else if(day >= 24 && day <= 31)
						System.out.print("Scorpio");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 11)
			{
				if(day > 0 && day <= 31)
				{
					System.out.print("November "+day+" = ");
					if(day >= 1 && day <= 22)
						System.out.print("Scorpio");
					else if(day >= 23 && day <= 30)
						System.out.print("Sagittarius");
				}
				else
					System.out.print("Invalid date");
			}
			else if(month == 12)
			{
				if(day > 0 && day <= 31)
				{
					System.out.print("December "+day+" = ");
					if(day >= 1 && day <= 21)
						System.out.print("Sagittarius");
					else if(day >= 22 && day <= 31)
						System.out.print("Capricorn");
				}
				else
					System.out.print("Invalid date");
			}
		}
		else
			System.out.print("Month is not valid!");
	}
}
