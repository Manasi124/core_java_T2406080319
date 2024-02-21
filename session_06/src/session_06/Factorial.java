package session_06;

public class Factorial {
	public int fact(int no) {
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		return fact;
	}

}