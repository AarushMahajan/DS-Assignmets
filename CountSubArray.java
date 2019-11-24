package github;

import java.util.Scanner;

public class CountSubArray {

	 public static void main(String[] args)
	    {
	        int count=0;
	         Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of array:");
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter the elements of an array:");
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Enter the integer to compare:");
	        int k=sc.nextInt();
	      
	        int m=n*(n+1)/2;
	        for(int i=0;i<n;i++)
	        {
	        	if(arr[i]<=k)
	        	{
	        		count++;
	        	}
	        }
	        int b=count*(count+1)/2;
	        m=m-b;
	        
			System.out.println("Output" +" "+ m);
			
			sc.close();
			
	    }
}