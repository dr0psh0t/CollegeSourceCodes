package defolt;

public class IntElement extends DataElement
{
	protected int num;
	
	//	default constructor
	public IntElement(){
		num = 0;
	}
	
	//	constructor with parameter
	public IntElement(int x){
		num = x;
	}
	
	//	copy constructor
	public IntElement(IntElement otherElement){
		num = otherElement.num;
	}
	
	public void setNum(int x){
		num = x;
	}
	
	public int getNum(){
		return num;
	}
	
	@Override
	public boolean equals(DataElement otherElement)
	{
		IntElement temp = (IntElement) otherElement;	
		return (num == temp.num);
	}
	
	@Override
	public int compareTo(DataElement otherElement)
	{
		IntElement temp = (IntElement) otherElement;
		return (num - temp.num);
	}
	
	@Override
	public void makeCopy(DataElement otherElement)
	{
		IntElement temp = (IntElement) otherElement;
		num = temp.num;
	}
	
	@Override
	public DataElement getCopy()
	{
		IntElement temp = new IntElement(num);
		return temp;
	}
	
	public String toString(){
		return String.valueOf(num);
	}
}