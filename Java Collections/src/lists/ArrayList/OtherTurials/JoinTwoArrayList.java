package lists.ArrayList.OtherTurials;
import java.util.ArrayList;

public class JoinTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First ArrayList
        ArrayList<String> arraylist1=new ArrayList<String>();
        arraylist1.add("AL1: E1");
        arraylist1.add("AL1: E2");
        arraylist1.add("AL1: E3");

        //Second ArrayList
        ArrayList<String> arraylist2=new ArrayList<String>();
        arraylist2.add("AL2: E1");
        arraylist2.add("AL2: E2");
        arraylist2.add("AL2: E3");

        //New ArrayList
        ArrayList<String> al= new ArrayList<String>();
        al.addAll(arraylist1);	// store arraylist1 to al
        al.addAll(arraylist2);	// store arraylist2 to al

        //Displaying elements of the joined ArrayList
        for(String temp: al){
            System.out.println(temp);
        }
	}

}
