package Asterisks;
import java.util.*;

public class LetterH extends Stars
{
	public LetterH(int hLength) 
	{
		super(hLength);
		drawH(hLength);
	}

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input H length: ");
		int length = console.nextInt();
		
		LetterH h = new LetterH(length);
	}
	
	public void drawH(int hLength)
	{
		int midOdd = (hLength / 2) + 1,
			midEven = hLength / 2;
		
		if(hLength < 3)
			System.out.print("Cannot draw H of length lower than 3.");
		else
		{
			if((hLength % 2) == 0)
			{
				for(int x = 1; x <= hLength; x++)
				{
					if(x == midEven)
						printStars();
					else
						System.out.print("*"+blankSpace()+" *");
					System.out.println();
				}
			}
			else
			{
				for(int x = 1; x <= hLength; x++)
				{
					if(x == midOdd)
						printStars();
					else
						System.out.print("*"+blankSpace()+" *");
					System.out.println();
				}
			}
		}
	}
}

/*
Sample run:

Input H length: 5
*       *
*       *
* * * * * 
*       *
*       *

*/