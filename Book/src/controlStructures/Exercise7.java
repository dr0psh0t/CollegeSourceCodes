package controlStructures;
import java.util.Scanner;

public class Exercise7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		int box = 24,
				container = 75,
				cookies;
		
		int boxShipped, exactCookies;
		int containersShipped, cookiesLeft;
		int cookiesRemaining;
		
		System.out.print("Enter number of cookies: ");
		cookies = console.nextInt();
		
		if(cookies < box)
		{
			boxShipped = box - cookies;
			System.out.printf("%d leftover cookies.", boxShipped);
			System.out.printf("\n%d leftover boxes.", 1);
		}
		else
		{
			if(cookies < 1800)
			{
				boxShipped = cookies / box;
				exactCookies = boxShipped * box;
				cookiesLeft = cookies - exactCookies;
				
				System.out.printf("\n%d cookies in %d boxes left.", exactCookies, boxShipped);
				System.out.printf("\n%d cookies left in the last box.", cookiesLeft);
				System.out.println("\nCannot shipped at this moment.");
			}
			else
			{				
				if((cookies % 1800) == 0)
				{
					boxShipped = cookies / box;
					exactCookies = boxShipped * box;
					containersShipped = boxShipped / container;
					
					System.out.print("\nShipped items:");
					System.out.printf("\n%d cookies in %d boxes in %d containers shipped.", exactCookies, boxShipped, containersShipped);
				}
				else
				{
					containersShipped = cookies / 1800;
					cookiesRemaining = cookies - (containersShipped * 1800);
					
					cookies =  cookies - cookiesRemaining;
					boxShipped = cookies / box;
					
					System.out.print("\nShipped items:");
					System.out.printf("\n%d cookies in %d boxes in %d containers shipped.", cookies, boxShipped, containersShipped);
					
					System.out.print("\n\nNot shipped items:");
					System.out.printf("\n%d cookies left in the last box.", cookiesRemaining);
					System.out.println("\nCannot shipped these leftovers.");
				}
			}			
		}			
	}
}