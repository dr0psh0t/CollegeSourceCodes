package warmUpOne;

public class EndUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EndUp e = new EndUp();
		
		System.out.print(e.endUp("Hello")+"\n");
		System.out.print(e.endUp("hi there")+"\n");
		System.out.print(e.endUp("hi"));
	}

	public String endUp(String str)
	{
		if(str.equals(""))
			return "";
		else if(str.length() < 4)
			return str.toUpperCase();
		else
		{
			String lastThree = "", firstHalf = "";
			int diff = str.length() - 3;
			
			for(int x = diff; x <= str.length() - 1; x++)
				lastThree += str.charAt(x);
			//lastThree.toUpperCase();
			
			for(int i = 0; i < diff; i++)
				firstHalf += str.charAt(i);
			
			return firstHalf+lastThree.toUpperCase();
		}
	}
}