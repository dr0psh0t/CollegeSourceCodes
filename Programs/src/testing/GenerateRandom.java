package testing;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class GenerateRandom {
	
	private static GregorianCalendar date = new GregorianCalendar();
	private static Random rand = new Random();
	private static int rem = date.get(Calendar.YEAR) % 100;
	
	public static int generateID()
	{
		StringBuilder strNum = new StringBuilder("");
		
		int[] id = new int[6];
		
		id[0] = rem / 10;
		id[1] = rem % 10;
		
		strNum.append(id[0]);
		strNum.append(id[1]);
		
		for(int x = 2; x < 6; ++x)
		{
			id[x] = rand.nextInt(10);
			strNum.append(id[x]);
		}
		
		return Integer.parseInt(strNum.toString());
	}

	public static void main(String[] args) {

		for(int x = 0; x < 5; ++x)
			System.out.println(generateID());
	}
}
