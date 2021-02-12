package lists.Vector.RemoveSortReplace;
import java.util.Vector;

/*
public void setSize(int newSize)
Sets the size of this vector. If the new size is greater than the current size, new null items are added
to the end of the vector. If the new size is less than the current size, all components at index
newSize and greater are discarded.
 */
public class SetSizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Walter");
		vector.add("Anna");
		vector.add("Hank");
		vector.add("Flynn");
		vector.add("Tom");
		
		//	setting up the size greater than current size
		vector.setSize(10);
		System.out.println("Vector size: "+vector.size());
		System.out.println("Vector elements: ");
		for(int i = 0; i < vector.size(); i++)
			System.out.println(vector.get(i));
		
		//	setting up the size less than current size
		vector.setSize(3);
		System.out.println("Vector size: "+vector.size());
		System.out.println("Vector elements: ");
		for(String f : vector)
			System.out.println(f);
	}

}
