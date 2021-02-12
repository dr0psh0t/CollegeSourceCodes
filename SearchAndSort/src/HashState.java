public class HashState
{
	String name, capital;
	int yearOfAdmission, orderOfAdmission, area;
	
	public HashState(String name, String capital, int yearOfAdmission, int orderOfAdmission, int area)
	{
		this.name = name;
		this.capital = capital;
		this.yearOfAdmission = yearOfAdmission;
		this.orderOfAdmission = orderOfAdmission;
		this.area = area;
	}
	
	public void setState(String name, String capital, int yearOfAdmission, int orderOfAdmission, int area)
	{
		this.name = name;
		this.capital = capital;
		this.yearOfAdmission = yearOfAdmission;
		this.orderOfAdmission = orderOfAdmission;
		this.area = area;
	}
	
	public HashState()
	{
		name = "";
		capital = "";
		yearOfAdmission = 0;
		orderOfAdmission = 0;
		area = 0;
	}
	
	public String getStateName(){
		return name;
	}
	
	public String getStateCapital(){
		return capital;
	}
	
	public int getYearOfAdmission(){
		return yearOfAdmission;
	}
	
	public int getOrderOfAdmission(){
		return orderOfAdmission;
	}
	
	public int getArea(){
		return area;
	}
	
	public void printState()
	{
		System.out.print("\n********** STATES **********\n\n");
		System.out.print("State: "+name +"\nCapital: "+capital+"\nArea: "+area+"\nYear of admission: "+yearOfAdmission+"\nOrder of admission: "+orderOfAdmission);
		System.out.print("\n\n*********** END ***********\n");
	}
	
	public String toString()
	{
		String str = "";
		str = "State: "+name +"\nCapital: "+capital+"\nArea: "+area+"\nYear of admission: "+yearOfAdmission+"\nOrder of admission: "+orderOfAdmission;
		return str;
	}
}
