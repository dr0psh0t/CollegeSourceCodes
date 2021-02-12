package shapes;
import java.util.*;

public class JavaChallengeMain {

	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.print("Example: 5 v O X Y Z 0\n");
		System.out.print("Input: Big case letter(press 0 to stop):");
		String str;
		
		do
		{
			str = console.next();
			al.add(str);
		}
		while(!str.equals("0"));
		
		int size = Integer.parseInt(al.get(0));
		if(size < 3 || ((size % 2) == 0))
		{
			System.out.print("Error size.");
			System.exit(0);
		}
			
		String position = al.get(1);
		
		if(position.equals("v") || position.equals("V"))
			drawVertical(al, size);
		else if(position.equals("h") || position.equals("H"))
			drawHorizontal(al, size);
		else
			System.out.print("Position is invalid");
	}
	
	@SuppressWarnings("unused")
	public static void drawVertical(ArrayList<String> al2, int size)
	{
		for(int x = 2; x <= al2.size() - 1; x++)
		{
			if(al2.get(x).equals("O"))
			{
				DrawBox box = new DrawBox(size, 'v');
				System.out.println();
			}
			else if(al2.get(x).equals("Y"))
			{
				DrawY y = new DrawY(size, 'v');
				System.out.println();
			}
			else if(al2.get(x).equals("Z"))
			{
				DrawZ z = new DrawZ(size, 'v');
				System.out.println();
			}
			else if(al2.get(x).equals("X"))
			{
				DrawX xx = new DrawX(size, 'v');
				System.out.println();
			}
			else
				;
		}
	}
	
	public static void drawHorizontal(ArrayList<String> al2, int size)
	{
		DrawBox box = new DrawBox(size, 'h');
		DrawZ z = new DrawZ(size, 'h');
		DrawX x = new DrawX(size, 'h');
		DrawY y = new DrawY(size, 'h');
		
		String[] horizon = new String[size];
		
		for(int u = 0; u < size; u++)
			horizon[u] = new String("");
		
		for(int j = 0; j < size; j++)
			System.out.println(box.getStarsIndex(j)+" "+x.getStarsIndex(j)+" "+y.getStarsIndex(j)
					+""+z.getStarsIndex(j));
	}
}