package defolt;
import static java.lang.System.*;

public class ExcavationGame
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int num = new java.util.Scanner(in).nextInt();
		
		if(num > 9 && num < 100)
		{
			int first = num / 10;
			int second = num % 10;			
			out.println(first+second+num);
		}
		else
			err.printf("%d is not a double-digit", num);
	}
}