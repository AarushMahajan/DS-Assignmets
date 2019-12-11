package github;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		
		int arr[][]= new int[r1][c1];
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		int a=0,b=r1-1,c=c1-1,d=0;
		
		while(r1%3==0 || r1%2==0) {
		
		for(int i=a;i<=b;i++) {
			System.out.print(arr[a][i]+" ");
		}
		for(int i=a+1;i<=c;i++) {
			System.out.print(arr[i][b]+" ");
		}
		for(int i=c-1;i>=d;i--) {
			System.out.print(arr[c][i]+" ");
		}
		for(int i=b-1;i>a;i--) {
			System.out.print(arr[i][a]+" ");
		}
		a++;
		b--;c--;
		d++;
		}
		sc.close();
	}

}

//4
//4
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16