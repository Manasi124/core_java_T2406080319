
public class Employee {
	private int empid;
	private String empName;
	private double empSalary;
	
	public Employee()
	{
	System.out.println("Default Constructor Called");
	
	  empid=111;
	  empName="Rahul";
	  empSalary=210000.67d;
	}
	public Employee(int i,String n,double d)
	{
		System.out.println("Parameterized Constructor Called");
		empid = i;
		empName=n;
		empSalary=d;
	}
	
	public String toString()
	//String representation of object-object class
	{
		return "Employee = "+empid+" "+empName+" "+empSalary;
	}
	public static void main(String[] args) {
		Employee e =new Employee();
		System.out.println(e);
		Employee e1 = new Employee(222,"vishal",53987.89d);
		System.out.println(e1);
		
		
	}

}
