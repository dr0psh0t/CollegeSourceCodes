package anotherThreadExample;

public class ThreadClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DisplayMessage hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(hello);
		
		thread1.setDaemon(true);
		thread1.setName("hello");
		System.out.println("Starting hello thread...");
		thread1.start();
		
		DisplayMessage bye = new DisplayMessage("Goodbye");
		Thread thread2 = new Thread(bye);
		
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.setDaemon(true);
		System.out.println("Starting goodbye thread...");
		thread2.start();
		
		System.out.println("Starting thread3...");
		GuessANumber thread3 = new GuessANumber(27);
		thread3.start();
		
		try{
			thread3.join();
		}
		catch(InterruptedException e){
			System.out.println("Thread interrupted.");
		}
		
		System.out.println("Starting thread4...");
		GuessANumber thread4 = new GuessANumber(75);
		thread4.start();
		System.out.println("main() is ending...");
	}

}
