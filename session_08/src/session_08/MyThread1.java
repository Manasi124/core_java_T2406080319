package session_08;

public class MyThread1 implements Runnable {
	
	public void run() {
		for(int i=1;i<3;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		Thread t1 = new Thread(m1);
		MyThread m2 = new MyThread();
		Thread t2 = new Thread(m2);
		MyThread m3 = new MyThread();
		Thread t3 = new Thread(m3);
		t1.setName("one");
		t2.setName("two");
		t3.setName("three");
		t1.start();
		t2.start();
		t3.start();
	}

}
