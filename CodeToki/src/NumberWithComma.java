import java.util.*;

public class NumberWithComma 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Input a number: ");
		int num = console.nextInt();
		
		System.out.print(formatNumber(num));
	}
	
	public static String formatNumber(int num)
	{
		String strNum = num+"", str = "";
		int count = 0;
		
		for(int i = strNum.length() - 1; i >= 0; i--)
		{
			if(count == 3)
			{
				str = ","+str;
				count = 0;
				i++;
			}
			else
			{
				str = strNum.charAt(i) + str;
				count++;
			}
		}
		return str;
	}
}
