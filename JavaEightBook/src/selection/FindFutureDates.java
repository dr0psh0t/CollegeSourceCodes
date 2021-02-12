package selection;

import java.util.Scanner;

public class FindFutureDates {

	public static void main(String[] args) {

		Scanner con = new Scanner(System.in);
		
		int today, nextDay;
		
		try
		{
			System.out.print("Enter today's day: ");
			today = con.nextInt();
			
			if(today < 0 || today > 6)
			{
				con.close();
				throw new IllegalArgumentException("Illegal argument bounds.\nMust between 0 and 6.");
			}
			
			System.out.print("Enter the number of days elapsed since today: ");
			nextDay = con.nextInt();
			
			switch((today + nextDay) % 7)
			{
			case 0: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			default: System.out.println("default");
			}
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
		con.close();
	}

}
