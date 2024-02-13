public class Date {
	
	private int dd,mm,yy;//instance variable
	
	public void initDate()
	{
		dd=mm=yy=1;
	}
	public void setData(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void displayDate()
	{
		System.out.println("Date= ["+dd+"/"+mm+"/"+yy+"]" );
	}
	
	public static void main(String[] args) {
		//date d;//reference variable
		Date d = new Date();
		System.out.println(d.dd);
		d.initDate();d.setData(06, 02, 2024);
		d.displayDate();
		   
		
	}

}
