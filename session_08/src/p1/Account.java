package p1;

public class Account {
	private int balance;
	public Account()
	{
		balance = 5000;
		
	}
	
	public void deposit(int amount)
	{
		int temp;
		temp=balance;
		temp=temp+balance;
		Thread.currentThread().sleep(500);
		balance = temp;
		System.out.println(Thread.currentThread());
	}

}
