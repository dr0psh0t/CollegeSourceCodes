package composition;
public class Person 
{
	String firstname, lastname;
	int age;
	
	public Person()
	{
		firstname = "";
		lastname = "";
		age = 1;
	}
	
	public Person(String firstname, String lastname, int age){
		setPerson(firstname, lastname, age);
	}
	
	public void setPerson(String firstname, String lastname, int age)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public String toString()
	{
		String str = "";
		str = lastname +" "+firstname+" "+age;
		
		if(!str.equals(""))
			return str;
		else
			return str = "Empty person";
	}
}