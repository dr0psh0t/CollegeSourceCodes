package defolt;

public class HelloRunnable implements Runnable
{
	@Override
	public void run(){
		System.out.println("Hello from a thread!");
	}
	
	public static void main(String[] sd){
		(new Thread(new HelloRunnable())).start();
	}
}