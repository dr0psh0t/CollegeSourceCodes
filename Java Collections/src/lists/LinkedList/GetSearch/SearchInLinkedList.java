package lists.LinkedList.GetSearch;
import java.util.LinkedList;

public class SearchInLinkedList {

	/*
	public int indexOf(Object o): Returns the index of the first occurrence of the 
	specified element in this list, or -1 if this list does not contain the element.

	public int lastIndexOf(Object o): Returns the index of the last occurrence of the 
	specified element in this list, or -1 if this list does not contain the element.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step1: Create a LinkedList
	     LinkedList<String> linkedlist = new LinkedList<String>();
	 
	     // Step2: Add elements to LinkedList
	     linkedlist.add("Tim");
	     linkedlist.add("Rock");
	     linkedlist.add("Hulk");
	     linkedlist.add("Rock");
	     linkedlist.add("James");
	     linkedlist.add("Rock");
	 
	     //Searching first occurrence of element
	     int firstIndex = linkedlist.indexOf("Rock");
	     System.out.println("First Occurrence of 'Rock': " + firstIndex);
	 
	     //Searching last occurrence of element
	     int lastIndex = linkedlist.lastIndexOf("Rock");
	     System.out.println("Last Occurrence of 'Rock': " + lastIndex);
	}

}
