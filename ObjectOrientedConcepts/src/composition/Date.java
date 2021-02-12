package composition;

public class Date 
{
	private int month;
	private int day;
	private int year;
	
	public Date()
	{
		month = 1;
		day = 1;
		year = 1900;
	}
	
	public Date(int month, int day, int year){
		setDate(month, day, year);
	}
	
	public void setDate(int month, int day, int year)
	{
		if(month >= 1  && month <= 12)
			this.month = month;
		else
			this.month = 1;
		
		switch(month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			if(day >= 1 && day <= 30)
				this.day = day;
			else
				day = 1;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day >= 1 && day <= 31)
				this.day = day;
			else
				this.day = 1;
			break;
		case 2:
			if(day >= 1 && day <= 29)
				this.day = day;
			else
				this.day = 1;
		}
		
		if(year >= 1900)
			this.year = year;
		else
			this.year = 1900;
	}
	
	public int daysPassed()
	{
		if(month == 1)
			return day;
		else
		{
			int daysPassed = 0;
			for(int i = 1; i < month; i++)
			{
				if(i == 2)
				{
					if(year % 4 == 0)
						daysPassed += 29;
					else
						daysPassed += 28;
				}
				else if(i == 4 || i == 6 || i == 9 || i == 11)
					daysPassed += 30;
				else
					daysPassed += 31;
			}
			int totalDaysPassed = daysPassed + day;
			return totalDaysPassed;
		}
	}
	
	public int daysRemaining()
	{
		if(month == 12)
		{
			int daysLeft = 0;
			for(int i = day + 1; i <= 31; i++)
				daysLeft += i;
			return daysLeft;
		}
		else
		{
			int daysLeftInMonth = 0, daysLeft = 0;
			if(month == 2)
			{
				if(year % 4 == 0)
					daysLeftInMonth = 29 - day;
				else
					daysLeftInMonth = 28 - day;
			}
			else if(month == 4 || month == 6 || month == 9 || month == 11)
				daysLeftInMonth = 30 - day;
			else
				daysLeftInMonth = 31 - day;
			
			for(int i = month + 1; i <= 12; i++)
			{
				if(i == 2)
				{
					if(year % 4 == 0)
						daysLeft += 29;
					else
						daysLeft += 28;
				}
				else if(i == 4 || i == 6 || i == 9 || i == 11)
					daysLeft += 30;
				else
					daysLeft += 31;
			}
			int totalDaysLeft = daysLeftInMonth + daysLeft;
			return totalDaysLeft;
		}
	}
	
	public int daysInMonth()
	{
		if(month == 2)
		{
			if(year % 4 == 0)
				return 29;
			else
				return 28;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else
			return 31;
	}
	
	public void addDays(int days)
	{
		for(int i = 1; i <= days; i++)
		{
			if(getMonth() == 2)
			{
				if(getYear() % 4 == 0)
				{
					incrementDay();
					if(getDay() > 29)
					{
						incrementMonth();
						setDay(1);
					}
				}
				else
				{
					incrementDay();
					if(getDay() > 28)
					{
						incrementMonth();
						setDay(1);
					}
				}
			}
			else if(getMonth() == 4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11)
			{
				incrementDay();
				if(getDay() > 30)
				{
					incrementMonth();
					setDay(1);
				}
			}
			else
			{
				incrementDay();
				if(getMonth() == 12 && getDay() > 31)
				{
					incrementYear();
					setDay(1);
					setMonth(1);
				}
				else if(getDay() > 31)
				{
					incrementMonth();
					setDay(1);
				}
			}
		}
	}
	public void incrementDay(){
		day++;
	}
	
	public void incrementMonth(){
		month++;
	}
	
	public void incrementYear(){
		year++;
	}
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public String toString(){
		return "Date: "+month+"-"+day+"-"+year;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getDay(){
		return day;
	}
}
