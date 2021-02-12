package set.HashSet.HashSetvsTreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeSet
	     TreeSet<String> tset = new TreeSet<String>();
	 
	     //add elements to TreeSet
	     tset.add("Abhijeet");
	     tset.add("Ram");
	     tset.add("Kevin");
	     tset.add("Singh");
	     tset.add("Rick");
	     // Duplicate removed
	     tset.add("Ram"); 
	  
	     // Displaying TreeSet elements
	     System.out.println("TreeSet contains: ");
	     for(String temp : tset){
	        System.out.println(temp);
	     }
	}

}
