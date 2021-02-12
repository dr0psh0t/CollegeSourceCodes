package problemOne;
import java.util.*;

public class ReverseTriangle {

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
		for(int x = stars; x >= 1; x--)
		{			
			if(x < stars)
				System.out.println(blankSpace(space)+stars(diff)+blankSpace(space));
			else
				System.out.println(stars(diff));
			
			diff -= 2;
			space += 1;
		}
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
		for(int i = 1; i <= space; i++)
			str += " ";
		return str;
	}
}
