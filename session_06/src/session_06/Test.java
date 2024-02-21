package session_06;

public class Test {

	public static void main(String[] args) {
		BOI  b=new BOI();
		System.out.println("BOI="+b.getROT());
		Bank b1=new SBI();//polymorphic reference
		System.out.println("SBI= "+b1.getROT());
	}
}