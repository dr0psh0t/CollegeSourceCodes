package nGrap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Bigram
{
	static Scanner con = new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice;
		String str = "I live in osaka. I am a graduate student."
				+ " My school is in nara.";
		str = str.toLowerCase();
		/*System.out.println("Enter a sentence: ");
		String str = con.nextLine();
		str = str.toLowerCase();*/
		System.out.println(str);
		
	    String[] arr = str.split("\\s+|(\\.+\\s+)|\\.");
	    
	    HashMap<String, Integer> uniMap = new HashMap<>();
	    HashMap<String, Integer> biMap = new HashMap<>();
	    HashMap<String, Double> highProb = new HashMap<>();
	    
	    arr = edit(arr);	    
	    uniMap = unigramFreq(arr);
	    biMap = bigramMap(arr);
	    
	    System.out.print("\n1. Check bigram sequence\n2. Word predict\n0. Exit\n\nchoice: ");
	    choice = con.nextInt();
	    
	    if(choice == 1)
	    {
	    	System.out.print("\nEnter a word: ");
		    String word = con.next();
		    System.out.print("Enter the previous word: ");
		    String prevWord = con.next();
		    
		    String stream = prevWord+" "+word;
		    
		    if(biMap.containsKey(stream))
		    {
		    	double val00 = uniMap.get(prevWord),
		    			val01 = biMap.get(stream),
		    			prob = val01 / val00;
		    	
		    	System.out.printf("P(%s|%s) = c(%s)/c(%s) = %.2f", word, prevWord,
		    			stream, prevWord, prob);
		    }
		    else
		    {
		    	System.out.print("Probability of \""+word+"\" given \""+prevWord+"\" is 0"
		    			+ "\nbecause the bigram \""+stream+"\" did not exist.");
		    }
	    }
	    else if(choice == 2)
	    {
	    	ArrayList<String> stream;
	    	System.out.print("Enter a word: ");
		    String word = con.next();
		    
		    highProb = table(uniMap, biMap, word);
		    stream = printNextWord(highProb);
		    
		    if(stream.size() != 0)
		    {
		    	System.out.print("\nPredicted word/s after the next input\nof the word \""+word+"\" is/are: ");
		    		System.out.print(stream);
		    }
	    }
	    else
	    	System.exit(0);
	}
	
	public static double maxN(double x, double y)
	{
		if(x > y)
			return x;
		else if(y > x)
			return y;
		else
			return x;
	}
	
	public static ArrayList<String> printNextWord(HashMap<String, Double> highProb)
	{
		Iterator<String> itr = highProb.keySet().iterator();
		ArrayList<String> list = new ArrayList<>();
		
		String key;
		double val,
			maxProb = 0;
		
		while(itr.hasNext())
		{
			key = (String) itr.next();
			val = highProb.get(key);			
			maxProb = maxN(maxProb, val);
		}
		
		key = "";
		val = 0;
		Iterator<String> iter = highProb.keySet().iterator();
		
		while(iter.hasNext())
		{
			key = (String) iter.next();
			val = highProb.get(key);
			
			if(maxProb == val)
				list.add(key);
		}
		return list;
	}
	
	public static HashMap<String, Double> table(HashMap<String, Integer> uniMap,
			HashMap<String, Integer> biMap, String str)
	{		
		HashMap<String, Double> highProb = new HashMap<>();
		if(uniMap.containsKey(str))
		{
			Iterator<String> itr = uniMap.keySet().iterator();
			double val = uniMap.get(str),
					val0;
			
			System.out.print("\n== BIGRAM SEQUENCE ==");
			System.out.print("\nWord\t\tCount\t\tProbability");
			System.out.print("\n-------------------------------------------");
			System.out.printf("\n%s\t\t%d\t\t%d", str, (int)val, 0);
			System.out.print("\n-------------------------------------------");
			
		    while(itr.hasNext())
		    {
		    	String key = (String) itr.next();
		    	String biWord = str+" "+key;
		    	
		    	if(biMap.containsKey(biWord))
		    	{
		    		val0 = biMap.get(biWord);
		    		double prob = val0 / val;
		    		System.out.print("\n"+biWord+"\t\t"+(int)val0+"\t\t"+prob);
		    		
		    		if(prob != 0)
		    			highProb.put(key, prob);
		    	}
		    	else
		    		System.out.printf("\n%s\t\t%d\t\t%d", biWord, 0, 0);
		    }
		}
		else
		{
			System.out.print("Word\t\tCount\t\tProbability");
			System.out.print("\n0\t\t0\t\t0");
		}
		
		System.out.println();
		return highProb;
	}
	
	public static HashMap<String, Integer> bigramMap(String[] arr)
	{
		System.out.println("\nBigram Frequency:");
		HashMap<String, Integer> map = new HashMap<>();
		
		int y = 1, length = arr.length;
		for(int x = 0; x < length; x++)
		{
			String biToken = arr[x]+" "+arr[y];
			if(map.containsKey(biToken))
			{
				int val = map.get(biToken) + 1;
				map.put(biToken, val);
			}
			else
				map.put(biToken, 1);
			
			y++;			
			if(y == length - 1)
			{
				x++;
				biToken = arr[x]+" "+arr[y];
				if(map.containsKey(biToken))
				{
					int val = map.get(biToken) + 1;
					map.put(biToken, val);
				}
				else
					map.put(biToken, 1);
				break;
			}
		}
		
		//	looping through the HashMap using Iterator class
		Iterator<String> itr = map.keySet().iterator();	    
	    while(itr.hasNext())
	    {
	    	String key = (String) itr.next();
	    	Integer val = map.get(key);
	    	
	    	System.out.println(key+" ["+val+"]");
	    }	    
	    return map;
	}
	
	public static HashMap<String, Integer> unigramFreq(String[] arr)
	{
		System.out.println("\nUnigram Frequency:");
	    HashMap<String, Integer> map = new HashMap<>();
	    
	    for(String token : arr)
	    {
	    	if(map.containsKey(token))
	    	{
	    		int val = map.get(token) + 1;
	    		map.put(token, val);
	    	}
	    	else
	    		map.put(token, 1);
	    }
	    
	    //	looping through the HashMap using foreach loop
	    for(String key : map.keySet())
	    	System.out.println(key+" ["+map.get(key)+"]");
	    return map;
	}
	
	public static String[] edit(String[] arr)
	{
		for(int g = 0; g < arr.length; g++)
	    {
	    	String token = arr[g];
	    	if(token.length() > 1)
	    	{
	    		if((token.startsWith("\"") || (token.startsWith("'"))) &&
	    				(token.endsWith("\"")) || (token.endsWith("'")))
	    			arr[g] = token.substring(1, token.length() - 1);
	    		else if(token.startsWith("\"") || token.startsWith("'"))
	    			arr[g] = token.substring(1);
	    		else if(token.endsWith("\"") || token.endsWith("'"))
	    			arr[g] = token.substring(0, token.length() - 1);
	    		
	    	}
	    }
		return arr;
	}

	public static void display(String[] arr)
	{
		for(String str : arr)
			System.out.println(str);
	}
}