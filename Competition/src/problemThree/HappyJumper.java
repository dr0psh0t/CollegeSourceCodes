package problemThree;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class HappyJumper {
	
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		Scanner inFile = new Scanner(new FileReader("texts/jumper.txt"));
		
		while(inFile.hasNext())
			al.add(inFile.nextInt());
		
		int count = 1, diff, absolute;
		for(int x = 0; x <= al.size() - 1; x++)
		{			
			diff = al.get(x) - al.get(count);
			
			if(diff < 0)
			{
				absolute = Math.abs(diff);
				al2.add(absolute);
			}
			else
				al2.add(diff);
			
			count++;
			
			if(count > al.size() -1)  // count already reached the maximum index
				break;
		}
		
		if(checkSequence(al2))
			System.out.print("Happy");
		else
			System.out.print("Not happy");
		
		inFile.close();
	}
	
	public static boolean checkSequence(ArrayList<Integer> al3)
	{
		if(al3.get(0) == al3.get(1))
			return false;
		else if(al3.get(0) > al3.get(1))
			return checkFromHighestToLowest(al3);
		else
			return checkFromLowestToHighest(al3);
	}
	
	private static boolean checkFromLowestToHighest(ArrayList<Integer> al3)
	{
		boolean following = true;
		int next;
		
		for(int x = 0; x <= al3.size() - 1; x++)
		{
			if(x == al3.size() - 1)
				break;
			
			next = al3.get(x) + 1;
			if(al3.get(x + 1) != next)
			{
				following = false;
				break;
			}
		}
		return following;
	}
	
	private static boolean checkFromHighestToLowest(ArrayList<Integer> al3)
	{
		boolean following = true;
		int next;
		
		for(int x = 0; x <= al3.size() - 1; x++)
		{
			if(x == al3.size() - 1)
				break;
			
			next = al3.get(x) - 1;			
			if(al3.get(x + 1) != next)
			{
				following = false;
				break;
			}
		}
		return following;
	}
}
