package composition;

public class PersonalInfo 
{
	private Person name;
	private Date bDay;
	private int personalID;
	
	public PersonalInfo() 
	{
		name = new Person();
		bDay = new Date();
		personalID = 0;
	}
	
	public PersonalInfo(String firstname, String lastname, int age, int month, int day, int year, int ID)
	{
		name = new Person(firstname, lastname, age);
		bDay = new Date(month, day, year);
		personalID = ID;
	} 
	
	public void setPersonalInfo(String firstname, String lastname, int age, int month, int day, int year, int ID)
	{
		name.setPerson(firstname, lastname, age);
		bDay.setDate(month, day, year);
		personalID = ID;
	}
	
	public String toString()
	{
		String str = "";
		str = name+"\n"+bDay+"\n"+personalID;
		return str;
	}
}
