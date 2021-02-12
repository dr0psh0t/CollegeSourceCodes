public class Person 
{
	String firstname, lastname;
	int age;
	
	public Person(String firstname, String lastname, int age)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public String toString()
	{
		String str = "";
		str = lastname +" "+firstname+" "+age;
		return str;
	}
}