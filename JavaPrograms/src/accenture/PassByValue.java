package accenture;

import java.util.Scanner;

public class PassByValue
{
	public static void main(String[] args)
	{
		/*Dog a = new Dog("Java");
		
		System.out.println(a.getName());
		
		Test.test(a);
		
		System.out.println(a.getName());*/
		
		Scanner con = new Scanner(System.in);
		
		System.out.print("Enter seconds: ");
		int totalSeconds = con.nextInt();
		
		int hrs = totalSeconds / 3600;
		
		int minutes = totalSeconds % 3600 / 60;
		
		int seconds = totalSeconds % 3600 % 60;
		
		System.out.println();
		
		System.out.println(hrs+":"+minutes+":"+seconds);
		
		//System.out.println(500 / 60);
		
		con.close();
	}
	
	public static void test(Dog dog)
	{
		dog.setName("Ruby");
		System.out.println(dog.equals("Java"));
		
//		dog.setName("Ruby");
	}
}

class Test
{
	public static void test(Dog dog)
	{
		dog.setName("C++");
		System.out.println(dog.equals("Java"));
	}
}

class Dog
{
	private String name;
	
	public Dog(String name){
		this.name = name;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public boolean equals(Object name){
		return this.name.equals(name);
	}
}
