package generics;

public class GenericMethods 
{
	// generic method printArray
	public static <E> void printArray(E[] arrayElements)
	{
		// display array elements
		for(E element : arrayElements)
			System.out.printf("%s ", element);
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		// create arrays of Integer, Double and Character
		Integer[] intArray = {1, 2, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("Array integerArray contains: ");
		printArray(intArray);
		
		System.out.println("\nArray doubleArray contains: ");
		printArray(doubleArray);
		
		System.out.println("\nArray characterArray contains: ");
		printArray(charArray);
	}
}

/*
It would be nice if we could write a single sort method that could sort the elements in an Integer array, 
a String array or an array of any type that supports ordering.

Java Generic methods and generic classes enable programmers to specify, with a single method declaration,
 a set of related methods or, with a single class declaration, a set of related types, respectively.

Generics also provide compile-time type safety that allows programmers to catch invalid types at compile time.

Using Java Generic concept, we might write a generic method for sorting an array of objects, then invoke 
the generic method with Integer arrays, Double arrays, String arrays and so on, to sort the array elements.

Generic Methods:
You can write a single generic method declaration that can be called with arguments of different types. 
Based on the types of the arguments passed to the generic method, the compiler handles each method call 
appropriately. Following are the rules to define Generic Methods:

All generic method declarations have a type parameter section delimited by angle brackets (< and >) that 
precedes the method's return type ( < E > in the next example).

Each type parameter section contains one or more type parameters separated by commas. A type parameter, 
also known as a type variable, is an identifier that specifies a generic type name.

The type parameters can be used to declare the return type and act as placeholders for the types of the 
arguments passed to the generic method, which are known as actual type arguments.

A generic method's body is declared like that of any other method. Note that type parameters can represent o
nly reference types, not primitive types (like int, double and char).
 */