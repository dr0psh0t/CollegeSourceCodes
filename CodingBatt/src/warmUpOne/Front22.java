package warmUpOne;
/*
Given a string, take the first 2 chars and return the string 
with the 2 chars added at both the front and back, so "kitten" 
yields"kikittenki". If the string length is less than 2, use 
whatever chars are there. 

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
public class Front22 
{
	public static void main(String[] args) 
	{
		System.out.print(front22("abc"));
	}
	
	public static String front22(String str) 
	{
	    String let1 = "";
	    if(str.equals(""))
	    	return str;
	    else if(str.length() > 1)
	    {
	    	for(int i = 0; i <= 1; i++)
		        let1 = let1 + str.charAt(i);
		    
		    return let1+str+let1;
	    }
	    else
	    	return str+str+str;
	}

}
