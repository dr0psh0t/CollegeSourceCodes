package threads;

public class Bucky
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Tuna("one"));
		Thread t2 = new Thread(new Tuna("two"));
		
		t1.start();
		t2.start();
	}
}