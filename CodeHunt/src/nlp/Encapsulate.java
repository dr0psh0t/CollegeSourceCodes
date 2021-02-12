package nlp;

public class Encapsulate {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulate en = new Encapsulate();
		System.out.print("Input string: ");
		String stream = new java.util.Scanner(System.in).nextLine();
		
		if(stream.length() < 3)
			System.out.print("Length should be 3 or more");
		else
			en.encap(stream);
	}
	
	private void encap(String source)
	{
		int startIndex = 1;
		
		for (int i = 0; i < source.length() - 2; i++) 
		{
			for (int j = 0; j < source.length(); j++)
			{
				if(startIndex == j)
					System.out.print("_");
				else
					System.out.print(source.charAt(j));
			}
			
			System.out.println();
			startIndex++;
		}
	}
}
