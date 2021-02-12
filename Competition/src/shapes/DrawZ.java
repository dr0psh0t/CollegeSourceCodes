package shapes;

public class DrawZ extends Stars
{
	private String[] stars;	
	public DrawZ(int zLength, char position)
	{
		super(zLength);
		
		if(position == 'v' || position == 'V')
			drawZ(zLength);
		else if(position == 'h' || position == 'H')
		{
			stars = new String[zLength];
			initializeStarsArray(zLength);
			storeStarsArray(zLength);
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
	
	private void storeStarsArray(int zLength)
	{
		int index = 0;
		for(int x = 1; x <= zLength; x++)
		{
			if(x == 1 || x == zLength)
			{
				stars[index] = returnStars();
				index++;
			}
			else
			{
				stars[index] = starLocation(x, zLength);
				index++;
			}
		}
	}
	
	public void drawZ(int zLength)
	{
		if(zLength < 3)
			System.out.print("Cannot draw box of length less than 3");
		else
		{
			for(int x = zLength; x >= 1; x--)
			{
				if(x == 1 || x == zLength)
					System.out.print(returnStars());
				else
					System.out.print(starLocation(x, zLength));
				System.out.println();
			}
		}
	}
	
	private String starLocation(int starPosition, int zLength)
	{
		String str = "", space = "";
		int diff = zLength - starPosition;
		
		for(int x = 1; x <= starPosition; x++)
		{
			if(x == starPosition)
				str += "*";
			else
				str += " ";
		}
		
		for(int x = 1; x <= diff; x++)
			space += " ";
		
		return str+space;
	}
}