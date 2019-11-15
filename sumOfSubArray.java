import java.util.Scanner;

public class sumOfSubArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array :");
		int n=sc.nextInt();
		System.out.println("Enter the elements of an Array :");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of Sum :");
		int s=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=arr[i];
			for(int j=i+1;j<n;j++) {
				sum+=arr[j];
				if(sum==s)
				{
					System.out.println("Starting index is :"+" "+i);
					System.out.println("Ending index is :"+" "+j);
				}
			}
		}
	}
}
