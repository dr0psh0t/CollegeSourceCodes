package shapes;

public abstract class Stars 
{
	private int length;
	private String[] strX, strY;
	
	public Stars(int length)
	{
		if(length < 2)
			this.length = 3;
		else
			this.length = length;
		
		strX = new String[length];
		strY = new String[length];
		
		initializeStrX(length);
		initializeStrY(length); 
		
		storeX();
		storeY();
	}
	
	private void initializeStrX(int length)
	{
		for(int x = 0; x < length; x++)
			strX[x] = new String("");
	}
	
	private void initializeStrY(int length)
	{
		for(int x = 0; x < length; x++)
			strY[x] = new String("");
	} 
	
	protected String[] yArray()	{
		return strY;
	}
	
	protected String[] xArray(){
		return strX;
	}
	
	public void drawY() // printing of letter Y
	{
		int quo = (length / 2) + 1;
		int fromFirst = 1, fromLast = length, space = 0;
		
		for(int x = 1; x <= length; x++)
		{
			if(x <= quo)
			{
				System.out.print(vSpaces(fromFirst, fromLast, space));
				System.out.println();
				
				fromFirst++;
				fromLast--;
				space++;
			}
			else
			{
				System.out.print(yRemaining(quo));
				System.out.println();
			}
		}
	}
	
	private void storeY()
	{
		int quo = (length / 2) + 1;
		int fromFirst = 1, fromLast = length, space = 0;
		int index = 0;
		
		for(int x = 1; x <= length; x++)
		{
			if(x <= quo)
			{
				strY[index] = vSpaces(fromFirst, fromLast, space);
				index++;
				
				fromFirst++;
				fromLast--;
				space++;
			}
			else
			{
				strY[index] = yRemaining(quo);
				index++;
			}
		}
	}
	
	private void storeX()
	{
		int quo = (length / 2) + 1;
		int fromFirst = 1, fromLast = length, space = 0;
		int index = 0;
		
		for(int x = 1; x <= length; x++)
		{
			if(x == quo)
			{
				strX[index] = printMiddle(length, quo);
				index++;
			}
			else if(x < quo)
			{				
				strX[index] = vSpaces(fromFirst, fromLast, space);
				index++;
				
				fromFirst++;
				fromLast--;
				space++;
			}
			else
			{
				fromFirst--;
				fromLast++;
				space--;
				
				strX[index] = revSpaces(fromFirst, fromLast, space);
				index++;
			}
		}
	}
	
	public void drawX() // printing of letter X
	{
		int quo = (length / 2) + 1;
		int fromFirst = 1, fromLast = length, space = 0;
		
		for(int x = 1; x <= length; x++)
		{
			if(x == quo)
			{
				System.out.print(printMiddle(length, quo));
				System.out.println();
			}
			else if(x < quo)
			{
				System.out.print(vSpaces(fromFirst, fromLast, space));
				System.out.println();
				
				fromFirst++;
				fromLast--;
				space++;
			}
			else
			{
				fromFirst--;
				fromLast++;
				space--;
				
				System.out.print(revSpaces(fromFirst, fromLast, space));
				System.out.println();
			}
		}
	}
	
	private String printMiddle(int size, int half)
	{
		String str = "";
		
		for(int x = 1; x <= size; x++)
		{
			if(x == half)
				str += "*";
			else
				str += " ";
		}
		return str;
	}
	
	private String revSpaces(int fromFirst, int fromLast, int leftAndRightSpaces)
	{
		String str = "", space = "";
		int last = fromLast, first = fromFirst;
		
		for(int x = 1; x <= length; x++)
		{
			if((x > first) && (x < last))
				str += " ";
			else if(x == first || x == last)
				str += "*";
		}
		
		if(leftAndRightSpaces > 0)
		{
			for(int x = 1; x <= leftAndRightSpaces; x++)
				space += " ";
		}
		
		return space+str+space;
	}
	
	private String yRemaining(int position)
	{
		String str = "", strSpaces = "";
		int space = (length / 2);
		
		for(int x = 1; x <= length; x++)
		{
			if(x == position)
				str += "*";
		}
		
		for(int x = 1; x <= space; x++)
			strSpaces += " ";
		
		return strSpaces+str+strSpaces;
	}
	
	private String vSpaces(int fromFirst, int fromLast, int leftAndRightSpaces)
	{
		String str = "", space = "";
		int last = fromLast, first = fromFirst;
		
		for(int x = 1; x <= length; x++)
		{
			if((x > first) && (x < last))
				str += " ";
			else if(x == first || x == last)
				str += "*";
		}
		
		if(leftAndRightSpaces > 0)
		{
			for(int x = 1; x <= leftAndRightSpaces; x++)
				space += " ";
		}
		
		return space+str+space;
	}
	
	public String returnStars()
	{
		String str = "";
		for(int x = 1; x <= length; x++)
			str += "*";
		return str;
	}
	
	public String blankSpace() // for O only
	{
		String blanks = "";
		
		for(int x = 1; x <= length - 2; x++)
			blanks += " ";
		return blanks;
	}
}
