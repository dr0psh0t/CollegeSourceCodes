package warmUpOne;

public class EveryNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EveryNth n = new EveryNth();
		
		System.out.print(n.everyNth("Miracle", 2)+"\n");
		System.out.print(n.everyNth("abcdefg", 2)+"\n");
		System.out.print(n.everyNth("abcdefg", 3));
	}

	public String everyNth(String str, int n) 
	{
		if(str.equals(""))
			return "";
		else
		{
			String newStr = "";
			
			for(int x = 0; x <= str.length() - 1; x += n)
				newStr += str.charAt(x);
			
			return newStr;
		}
	}
}
