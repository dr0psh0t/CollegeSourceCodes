import java.util.*;

public class StateData
{
	String name, capital;
	int yearOfAdmission, orderOfAdmission, area;
	Scanner console = new Scanner(System.in);
	
	public StateData()
	{
		name = "";
		capital = "";
		yearOfAdmission = 0;
		orderOfAdmission = 0;
		area = 0;
	}
	
	public void setStateInfo(String name, String capital, int yearOfAdmission, int orderOfAdmission, int area)
	{
		this.name = name;
		this.capital = capital;
		this.yearOfAdmission = yearOfAdmission;
		this.orderOfAdmission = orderOfAdmission;
		this.area = area;
	}
	
	public String getStateName()
	{
		String str = name;
		return str;
	}
	
	public String getStateCapital()
	{
		String str = capital;
		return str;
	}
	
	public int getYearOfAdmission()
	{
		int year = yearOfAdmission;
		return year;
	}
	
	public int getOrderOfAdmission()
	{
		int order = orderOfAdmission;
		return order;
	}
	
	public int getArea()
	{
		int areas = area;
		return areas;
	}
	
	public void printStateInfo()
	{
		System.out.print("********** State Info **********\n\n");
		System.out.print("State: "+name+"\nCapital: "+capital+"\nYear of admission: "+yearOfAdmission+"\nOrder of admission: "+orderOfAdmission+"\nArea: "+area);
		System.out.print("\n\n********** State Info **********");
	}
	
	public void setState()
	{
		String sName, capital;
		int yearOfAdmission, orderOfAdmission, area;
		
		System.out.print("Input state name: ");
		sName = console.next();
		System.out.print("\nInput state capital: ");
		capital = console.next();
		System.out.print("\nInput year of admission: ");
		yearOfAdmission = console.nextInt();
		System.out.print("\nInput order of admission: ");
		orderOfAdmission = console.nextInt();
		System.out.print("\nInput state area: ");
		area = console.nextInt();
		
		setStateInfo(sName, capital, yearOfAdmission, orderOfAdmission, area);
	}
	
	public String toString()
	{
		String str = "";
		str = name +" "+capital+" \n"+area+" "+yearOfAdmission+" "+orderOfAdmission+" ";
		return str;
	}
}
