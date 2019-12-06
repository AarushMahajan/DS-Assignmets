package github;

import java.util.Scanner;

public class HigestPrimeFactro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int n =sc.nextInt();
		int count = 0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			if(count>1) {
				if(n%2==0)
					n=n/2;
				else
					n=n/2-1;
				i=2;
				count=0;
			}
			if(count==1 && i==n) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
