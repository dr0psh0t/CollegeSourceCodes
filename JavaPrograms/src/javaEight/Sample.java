package javaEight;

import java.util.*;
//import java.util.function.Consumer;

// refactoring from external to internal iterator
public class Sample {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		
				for(int i = 0; i < values.size(); i++)
			System.out.println(values.get(i));
		
		//for(int e : values)
		//	System.out.println(e);
		
		// external iterator
		// internal iterator
		/*values.forEach(new Consumer<Integer>(){
			public void accept(Integer value){
				System.out.println(value);
			}
		});*/
		
//		values.forEach((Integer value) -> System.out.println(value));
		
//		values.forEach((value) -> System.out.println(value));
		
//		values.forEach(value -> System.out.println(value));
		
//		values.forEach(System.out::println);	// just passing through. no alterations
	}
}