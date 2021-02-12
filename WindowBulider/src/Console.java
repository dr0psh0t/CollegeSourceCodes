import java.util.*;

public class Console 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int choice;		
		do
		{
			System.out.print("Press\n1. for timer window\n2. temperature window\n3. currency window\n4. exit\n\n");
			choice = console.nextInt();
			
			if(choice == 1)
				timerWindow();
			else if(choice == 2)
				temperature();
			else if(choice == 3)
				currency();
			else if(choice == 4)
				System.exit(0);
		}
		while(true);
	}
	
	@SuppressWarnings("unused")
	public static void currency(){
		Currency curr = new Currency();
	}
	
	@SuppressWarnings("unused")
	public static void temperature(){
		Temperature temp = new Temperature();
	}
	
	@SuppressWarnings("unused")
	public static void timerWindow(){
		TimerWindow time = new TimerWindow();
	}
}
