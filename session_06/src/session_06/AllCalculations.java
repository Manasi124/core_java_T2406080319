package session_06;

public class AllCalculations extends Factorial implements StaticCal,CompareCal {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition= "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Substraction= "+(a-b));
		
	}

	@Override
	public int compare(int a, int b) {
		int c=(a>b)?a:b;
		return c;
	}

	@Override
	public void avg(int a, int b) {
		int v=(a+b)/2;
		System.out.println("Average= "+v);
		
	}
	

}