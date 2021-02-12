package def;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class IDDigits
{
	/*
	 * nextInt(10) = [0...9]
	 * nextInt(5 + 1) + 10 = [0...5]  + 10 = [10...15]
	 */

	private static GregorianCalendar date = new GregorianCalendar();
	private static Random rand = new Random();
	private static int rem = date.get(Calendar.YEAR) % 100;
	
	public static int generateID()
	{
		int[] id = new int[6];
		String strNum = "";
		
		id[0] = rem / 10;
		id[1] = rem % 10;
		
		strNum = id[0] + "" + id[1];
		
		for(int x = 2; x < 6; ++x)
		{
			id[x] = rand.nextInt(10);
			strNum += id[x];
		}
		
		return Integer.parseInt(strNum);
	}
	
	public static void main(String[] fgh)
	{
		for(int y = 0; y < 5; ++y)
			System.out.println(generateID());
	}
}