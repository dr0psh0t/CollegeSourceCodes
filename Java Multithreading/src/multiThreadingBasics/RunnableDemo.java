package multiThreadingBasics;

public class RunnableDemo implements Runnable
{
	private Thread t;
	private String threadName;
	
	public RunnableDemo(String name)
	{
		threadName = name;
		System.out.println("Creating "+threadName);
	}
	
	public void run()
	{
		System.out.println("Running "+threadName);
		try
		{
			for(int i = 4; i > 0; i--)
			{
				System.out.println("Thread: "+threadName+", "+i);
				Thread.sleep(3000);	// let the thread sleep for a while
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread "+threadName+" interrupted.");
		}
		System.out.println("Thread "+threadName+" exiting");
	}
	
	public void start()
	{
		System.out.println("Starting "+threadName+"\n");
		if(t == null)
		{
		/*
			the "this" keyword used as an argument(parameter) below is an instance of 
			the this class RunnableDemo that implements the Runnable interface above
		*/	
			t = new Thread(this, threadName);
			t.start();
		}
	}
}