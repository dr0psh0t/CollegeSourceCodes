package experiments;

public class HashCode {

	public static void main(String[] args) {

		Employee emp1 = new Employee("hi");
		Employee emp2 = new Employee("hi");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}
	
	public static class Employee
	{
		private String name;
		
		public Employee(String name){
			this.name = name;
		}
		
		@Override
		public boolean equals(Object obj)
		{
			if(this == obj)
				return true;
			
			if(obj == null)
				return false;
			
			if(getClass() != obj.getClass())
				return false;
			
			Employee other = (Employee) obj;
			
			if(name == null && other.name != null)
				return false;
			else if(!name.equals(other.name))
				return false;
			
			return true;
		}
		
		/*
		 * this overrides the default hash code generated from Object using
		 * the name of the employee of type String as the hash code.
		 */
		@Override
		public int hashCode()
		{
			if(name == null)
				return 0;
			else
				return name.hashCode();
		}
	}
}