package composition;
import java.util.*;

public class MainDate 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Date test = new Date(12, 31, 2012);
		
		System.out.print(test);
		System.out.print("\nDays in "+test.getMonth()+": "+test.daysInMonth());
		System.out.print("\nDays passed: "+test.daysPassed());
		System.out.print("\nDays remaining: "+test.daysRemaining());
		test.addDays(60);
		System.out.print("\ndays added: "+test);
	}
}