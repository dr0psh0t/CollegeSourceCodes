package problemOne;
import java.util.*;

public class Triangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int numOfStars;
		
		System.out.print("Input number of horizontal stars:"); 
		numOfStars = console.nextInt();
		
		drawStarsOfMaxHorizontal(numOfStars);
		System.out.println();
		drawStarsOfMaxVertical(numOfStars);
	}
	
	public static void drawStarsOfMaxHorizontal(int stars) // method only to show the max horizontal stars
	{
		int diff = 1, space = stars / 2;
		
		for(int x = 1; x <= stars; x++)
		{	
			if(x < stars)
				System.out.println(blankSpace(space)+stars(diff)+blankSpace(space));
			else
				System.out.println(stars(diff));
			
			space -= 1;
			diff += 2;
			
			if(diff > stars)
				break;
		}
	}
	
	public static void drawStarsOfMaxVertical(int stars) // method only to show the max vertical stars
	{
		int diff = 1, space = stars -  1;
		
		for(int x = 1; x <= stars; x++)
		{	
			if(x < stars)
				System.out.println(blankSpace(space)+stars(diff)+blankSpace(space));
			else
				System.out.println(stars(diff));
			
			space -= 1;
			diff += 2;
		}
	}
	
	public static String stars(int loopCount)
	{
		String str = "";
		
		for(int x = 1; x <= loopCount; x++)
			str += "*";
		
		return str;
	}
	
	public static String blankSpace(int space)
	{
		String str = "";
		for(int i = 1; i <= space; i++)
			str += " ";
		return str;
	}
}
