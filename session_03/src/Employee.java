
public class Employee {
	private int empid;
	private String empName;
	private float empSal;
	private static int count;
	
	public Employee() {}
	public Employee(int empid,String empName,float empSal) {
		this.empid=empid;
		this.empName=empName;
		this.empSal=empSal;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	public String toString() {
		return "Employee [empid=" + empid +","+"empName"+empName+","+"empSal="+empSal+"]";
	}
	static
	{
		System.out.println("static Block Called");
		count = 60;
	}
	
	public static void main(String[] args) {
		System.out.println("Main method called!!");
		Employee e1 = new Employee(111,"rahul",56132.89f);
		System.out.println(e1);
		Employee e2 = new Employee(222,"manasi",39132.69f);
		System.out.println(e2);
		Employee e3 = new Employee(333,"mahek",40382.59f);
		System.out.println(e3);
		System.out.println("Employee count="+e1.getCount());
		System.out.println("Employee count="+e2.getCount());
		System.out.println("Employee count="+e3.getCount());
		System.out.println("Employee count="+Employee.getCount());
		
		
		
	}

}
