package Asterisks;
import java.util.*;

public class DrawBox extends Stars
{
	public DrawBox(int boxLength) 
	{
		super(boxLength);
		drawBox(boxLength);
	}

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input box length: ");
		int boxLength = console.nextInt();
		
		DrawBox box = new DrawBox(boxLength);
	}
	
	public void drawBox(int boxLength)
	{
		if(boxLength < 2)
			drawTwo();
		else
		{
			for(int x = 1; x <= boxLength; x++)
			{
				if(x == 1 || x == boxLength)
					printStars();
				else
					System.out.print("*"+blankSpace()+" *");
				System.out.println();
			}
		}
	}
	
	public void drawTwo()
	{
		for(int x = 1; x <= 2; x++)
		{
			System.out.print("*  *");
			System.out.println();
		}
	}
}

/*
Sample run:

Input box length: 5
* * * * * 
*       *
*       *
*       *
* * * * * 

 */
