import java.util.*;

public class HashStateOperations 
{
	HashState state[];
	int size, index;
	HashState states = new HashState();
	static Scanner console = new Scanner(System.in);
	
	public HashStateOperations(int sizes)
	{
		size = sizes;
		index = 0;
		state = new HashState[size];
	}
	
	public void removeState(String stateName)
	{
		for(int i = 0; i <= index; i++)
		{
			if(stateName.equals(state[i].getStateName()))
			{
				state[i].setState("", "", 0, 0, 0);
				index--;
	//			break;
			}
		}
	}
	
	public int hashFunction(String name)
	{
		int i = 0, sum = 0, len = name.length(), k;
		
		for(k = 0; k < 15 - len; k++)
			name = name + ' ';
		
		for(k = 0; k < 5; k++)
		{
			sum = sum + (int) (name.charAt(i)) * 128 * 128
					+ (int) (name.charAt(i + 1)) * 128
					+ (int) (name.charAt(i + 2));
		}
		
		return sum % size;
	}
	
	public boolean isEqual(String name)
	{
		boolean found = false;
		
		for(int i = 0; i <= index; i++)
		{
			if(name.equals(state[i].getStateName()))
			{
				found = true;
				break;
			}
		}
		return found;
	}
	
	public void hashAdd()
	{
		System.out.print("\nInput state name to search: ");
		String hashAddress = console.next();
		if(isEqual(hashAddress))
			System.out.print(hashAddress+"'s hash address: "+hashFunction(hashAddress)+"\n");
		else
			System.out.print("State did not exist.\n");
	}
	
	public void search()
	{
		System.out.print("\nInput state name to search: ");
		String hashAddress = console.next();
		if(isEqual(hashAddress))
			System.out.print("State found. \n");
		else
			System.out.print("State did not exist.\n");
	}

	public void addState(String name, String capital, int yearOfAdmission, int orderOfAdmission, int area)
	{
		state[index] = new HashState(name, capital, yearOfAdmission, orderOfAdmission, area);
		index++;
	}
	
/*	public void addState(int hashIndex, String name, String capital, int yearOfAdmission, int orderOfAdmission, int area)
	{
		int pCount = 0, inc = 0;
		
		while(indexStatus[hashIndex] == 1 && (!state[hashIndex].getStateName().equals(name)) && pCount < size / 2)
		{
			pCount++;
			hashIndex = (hashIndex + inc) % size;
			inc = inc + 2;
		}
		
		if(indexStatus[hashIndex] != 1)
		{
			state[hashIndex] = new HashState(name, capital, yearOfAdmission, orderOfAdmission, area);
			indexStatus[hashIndex] = 1;
			index++;
		}
		else
		{
			if(state[hashIndex].getStateName().equals(name))
				System.out.print("Error: No duplicates are allowed.\n");
			else
				System.out.print("Error: The table is full. Unable to resolve collision.\n");
		}
	} */
	
	public void printState()
	{
		System.out.print("\n********** STATES **********\n\n");
		for(int i = 0; i <= size - 1; i++)
		{
			if(state[i] != null)
			{
				if(state[i].getStateName() != "")
				{
					System.out.print(state[i]+"\n");
					System.out.print("Hash address: "+hashFunction(state[i].getStateName())+"\n\n");
				}
			}
		}
		System.out.print("Length: "+index+"\n\n");
		System.out.print("*********** END ***********\n");
	}
}