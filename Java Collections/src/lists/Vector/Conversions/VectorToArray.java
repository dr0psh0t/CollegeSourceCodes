package lists.Vector.Conversions;
import java.util.Vector;

public class VectorToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Item1");
		vector.add("Item2");
		vector.add("Item3");
		vector.add("Item4");
		vector.add("Item5");
		vector.add("Item6");
		
		//	converting Vector to String Array
		String[] array = vector.toArray(new String[vector.size()]);
		
		//	displayig Array elements
		System.out.println("String Array elements:");
		for(int f = 0; f < array.length; f++)
			System.out.println(array[f]);
	}

}
