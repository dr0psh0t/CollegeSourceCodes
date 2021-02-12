package shapes;

public class DrawY extends Stars
{
	private String[] strY;
	public DrawY(int yLength, char position)
	{
		super(yLength);
		
		if(position == 'v' || position == 'V')
			drawY();
		else if(position == 'h' || position == 'H')
		{
			strY = new String[yLength];
			initializeYArray(yLength);
			storeYArray();
		}
		else
			;
	}
	
	private void initializeYArray(int xLength)
	{
		for(int x = 0; x < xLength; x++)
			strY[x] = new String("");
	}
	
	private void storeYArray(){
		strY = yArray();
	}
	
	public String getStarsIndex(int index){
		return strY[index];
	}
}