package javaScreening;

public class Artist
{
	private String firstName;
	private String lastName;
	
	public Artist()
	{
		firstName = "empty";
		lastName = "empty";
	}
	
	public Artist(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setName(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName(){
		return lastName+", "+firstName;
	}
	
	public String toString(){
		return lastName+", "+firstName;
	}
}