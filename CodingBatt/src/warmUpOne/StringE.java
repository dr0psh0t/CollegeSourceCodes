package warmUpOne;

public class StringE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringE str = new StringE();
		
		System.out.print(str.stringE("Hello")+"\n");
		System.out.print(str.stringE("Heelle")+"\n");
		System.out.print(str.stringE("Heelele"));
	}

	public boolean stringE(String str)
	{
		if(!str.contains("e"))
			return false;
		else
		{
			int numOfE = 0, count = 0;
			
			while(count <= str.length() - 1)
			{
				if(str.charAt(count) == 'e')
					numOfE++;
				count++;
			}
			
			if(numOfE == 0)
				return false;
			else if(numOfE >= 1 && numOfE <= 3)
				return true;
			else
				return false;
		}
	}
}