package shapes;

public class DrawBox extends Stars
{
	private String[] stars;	
	public DrawBox(int boxLength, char position) 
	{
		super(boxLength);
		
		if(position == 'v' || position == 'V')
			drawBox(boxLength);
		else if(position == 'h' || position == 'H')
		{
			stars = new String[boxLength];
			initializeStarsArray(boxLength);
			storeStarsArray(boxLength);
		}
		else
			;
	}
	
	private void initializeStarsArray(int length)
	{
		for(int x = 0; x < length; x++)
			stars[x] = new String("");
	}
	
	public String getStarsIndex(int starsIndex){
		return stars[starsIndex];
	}
	
	public void drawBox(int boxLength)
	{
		if(boxLength < 3)
			System.out.print("Cannot draw box of length less than 3");
		else
		{
			for(int x = 1; x <= boxLength; x++)
			{
				if(x == 1 || x == boxLength)
					System.out.print(returnStars());
				else
					System.out.print("*"+blankSpace()+"*");
				System.out.println();
			}
		}
	}
	
	private void storeStarsArray(int boxLength)
	{
		int index = 0;
		for(int x = 1; x <= boxLength; x++)
		{
			if(x == 1 || x == boxLength)
			{
				stars[index] = returnStars();
				index++;
			}
			else
			{
				stars[index] = "*"+blankSpace()+"*";
				index++;
			}
		}
	}
}
