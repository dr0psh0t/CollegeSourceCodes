package problemOne;

import java.util.Scanner;

public class ReverseSpaceTriangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int numOfStars;
		
		System.out.print("Input number of horizontal stars:"); 
		numOfStars = console.nextInt();
		
		drawStars(numOfStars);
	}
	
	public static void drawStars(int stars)
	{
		int diff = stars, space = 0;
		int half = (stars / 2), firstHalf = (half / 2);
		int count = 1, counter = 1;
		
		for(int x = stars; x >= 1; x--)
		{			
			if(x < stars)
			{
				if(count < firstHalf)
				{
					System.out.println(blankSpace(space)+stars(half-1)+
							midSpaces(counter)+stars(half-1)+blankSpace(space));
					count++;
					counter += 2;
					half -= 2;
				}
				else
					System.out.println(blankSpace(space)+stars(diff)+blankSpace(space));
			}
			else
				System.out.println(stars(diff));
			
			diff -= 2;
			space += 1;
		}
	}
	
	public static String midSpaces(int space)
	{
		String str = "";
		for(int x = 1; x <= space; x++)
			str += " ";
		return str;
	}
		
	public static String stars(int loopCount)
	{
		String str = "";
		
		for(int x = loopCount; x >= 1; x--)
			str += "*";
		
		return str;
	}
	
	public static String blankSpace(int space)
	{
		String str = "";
		for(int x = 1; x <= space; x++)
			str += " ";
		return str;
	}
}
