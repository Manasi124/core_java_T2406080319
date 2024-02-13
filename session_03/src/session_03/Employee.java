package session_03;

public class Employee {
	private int empNo;
	private float empSal;
	private float totalSalary;
	public static int count;
	
	
public Employee() {}
public Employee(int empNo,float empSal) {
	this.empNo=empNo;
	this.empSal=empSal;
	
	count++;
	
}
public static int getCount() {
	return count;
}

public String toString() {
	return "Employee [empNo="+empNo+", "+"totalSalary="+empSal+"]";
	
}

public static void main(String[] args) {
	
	Employee e1 = new Employee(111,30897.6543f);
	System.out.println(e1);
	Employee e2 = new Employee(222,45908.675f);
	System.out.println(e2);
	Employee e3 = new Employee(333,40382.59f);
	System.out.println(e3);
	System.out.println("Employee count="+Employee.getCount());
	
}


}


