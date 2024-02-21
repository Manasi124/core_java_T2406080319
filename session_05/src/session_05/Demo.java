 package session_05;

public class Demo {
	public static void main(String[] args) {
		int sum=0;
		int[][] arr = new int[2][3];
		arr[0][0]=1;
		
			for(int i=0;i<arr.length;i++)
			{
				sum=0;
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=i+j+1;
					sum+=arr[i][j];
					System.out.print(arr[i][j]+"\t");
					}
				System.out.println("sum="+sum);
			}
			
	}
}