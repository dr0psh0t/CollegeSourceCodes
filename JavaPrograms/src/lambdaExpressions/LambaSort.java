package lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class LambaSort {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("ruby", "bronze", "gold", "silver");
		
		System.out.println("Before Sort: "+names);

		/*
		 * public static <T> void sort(List<T> list, Comparator<? super T> c)
		 * 
		 * compare(T o1, T o2): int - Comparator
		 * 
		 */
		
		/*			List<T> list	Comparator<? super T> c
		Collections.sort(names, new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				return a.compareTo(b);
			}
		});*/
		
		// using lambda expression
		//			List<T> list	compare(T a, T b) method from Comparator	a.compareTo(b) - body of the method compare(T a, T b)
		//Collections.sort(names, (String a, String b) -> a.compareTo(b));
		//Collections.sort(names);
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		
		System.out.println("After Sort: "+names);
	}

}
