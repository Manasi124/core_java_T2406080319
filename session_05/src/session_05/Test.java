package session_05;

public class Test {
	public static void main(String[] arg) {
		int[] arr = new int[5];
		System.out.println(arr[0]);	
		
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = i+1;
	}
	
	System.out.println("Arrays elements are in follows: ");
	for(int a:arr) {
		System.out.println(a);
		
	}

}
}