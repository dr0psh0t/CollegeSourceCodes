package extendThreadClass;

public class ThreadDemo extends Thread
{
	private Thread t;
	private String threadName;
	
	public ThreadDemo(String name)
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
				Thread.sleep(50);	// let the thread sleep for a while
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread "+threadName+" interrupted.");
		}
		System.out.println("Thread "+threadName+" exiting");
	}
	
	public void start()
	{
		System.out.println("Starting "+threadName);
		if(t == null)
		{
		/*
			the "this" keyword used as an argument(parameter) below is an instance of the this class 
			ThreadDemo which extends the pre-defined class Thread that implements the interface Runnable
		*/
			t = new Thread(this, threadName);
			t.start();
		}
	}
}