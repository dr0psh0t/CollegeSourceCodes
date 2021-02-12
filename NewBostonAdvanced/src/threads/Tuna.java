package threads;

import java.util.Random;

public class Tuna implements Runnable
{
	String name;
	Random r = new Random();
	int time;
	
	public Tuna(String x)
	{
		name = x;
		time = r.nextInt(999);
	}
	
	@Override
	public void run()
	{
		try
		{
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n");
		}
		catch (Exception e){
		}
	}
}