package github;
import java.util.*;

public class SubarrayWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		int k = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=n-k;i++) {
			
			int max=0;
			
			for(int j=i;j<i+k;j++) {
				
				if(arr[j]>max) {
					max=arr[j];
				}
				
			}
			System.out.print(max+" ");
		}
			
		sc.close();
		
	}

}
