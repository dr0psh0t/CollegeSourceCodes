package chapterFive;

import java.util.Scanner;

public class Exercise18 {

	static Scanner con = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		//method1();
		method2();
		
		con.close();
	}
	
	/**
	 *  solving the problem using an approach in the book with
	 * techniques from start until Loops only.
	 */
	public static void method1()
	{
		int lockers, count = 0;
		
		System.out.print("Enter the number of lockers: ");
		lockers = con.nextInt();
		
		System.out.println();
		
		for(int x = 1; x <= lockers; ++x)
		{
			for(int y = 1; y <= x; ++y)
			{
				if((x % y) == 0)
					++count;
			}

			if((count % 2) != 0)
				System.out.println(x);
			
			count = 0;
		}
	}
	
	// another way to solve the problem treating lockers as objects
	public static void method2()
	{
		int lockers, count = 0;
		
		System.out.print("Enter the number of lockers: ");
		lockers = 1 + con.nextInt();
		
		System.out.println();
		
		Locker[] locks = new Locker[lockers];
		
		for(int i = 1; i < lockers; i++)
			locks[i] = new Locker();
		
		for(int g = 2; g < lockers; ++g)
		{
			for(int h = g; h < lockers; h += g)
				locks[h].setStatus(!locks[h].getStatus());
		}
		
		System.out.print("list of open lockers: ");
		
		for(int j = 1; j < lockers; ++j)
		{
			if(locks[j].getStatus())
			{
				System.out.print(j+" ");
				++count;
			}
		}
		
		System.out.println("\ntotal open = "+count);
	}
}

class Locker
{
	private boolean status;
	
	public Locker(){
		status = true;	// locker is open when init
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public boolean getStatus(){
		return status;
	}
}