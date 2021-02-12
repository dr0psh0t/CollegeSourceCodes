package defolt;

public class SleepMessages
{
	public static void main(String[] args) throws InterruptedException
	{
		String importantInfo[] = {"Mares eat oats", "Does eat oats", "Little lambs eat ivy", "A kid will eat ivy too"};
		
		for(int i = 0, limit = importantInfo.length; i < limit; ++i)
		{
			//	pause for 4 seconds
			Thread.sleep(250);
			
			//	print a message
			System.out.println(importantInfo[i]);
		}
	}
}