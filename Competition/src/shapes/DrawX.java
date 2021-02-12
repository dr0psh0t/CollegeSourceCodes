package shapes;

public class DrawX extends Stars
{
	private String[] strX;	
	public DrawX(int xLength, char position)
	{
		super(xLength);
		
		if(position == 'v' || position == 'V')
			drawX();
		else if(position == 'h' || position == 'H')
		{
			strX = new String[xLength];
			initializeXArray(xLength);
			storeXArray();
		}
		else
			;
	}
	
	private void initializeXArray(int xLength)
	{
		for(int x = 0; x < xLength; x++)
			strX[x] = new String("");
	}
	
	private void storeXArray(){
		strX = xArray();
	}
	
	public String getStarsIndex(int index){
		return strX[index];
	}
}
