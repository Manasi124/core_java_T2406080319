package session_06;

public class B extends A{
	public B() {
		//super();
		System.out.println("Default constructor of B");
	}
	public B(int a)
	{
		super(10);
		System.out.println("Parametrized constructor of B");
	}
	public static void main(String[] args) {
//		B b=new B();
		B b=new B(10);
	}

}