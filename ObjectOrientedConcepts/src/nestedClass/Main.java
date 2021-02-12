package nestedClass;

public class Main 
{
	// How to create instance of static and non static nested class?
	public static void main(String[] args) 
	{
		// create instance of nested static class
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		
		// call non static method of nested class
		printer.printMessage();
		
		// In order to create instance of Inner class we need an Outer class 
		// instance. Let us create Outer class instance for creating 
		// non-static nested class
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		// calling non-static method of InnerClass();
		inner.display();
		
		// we can also combine above steps to create instance of Inner class
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		innerObject.display();
	}
}