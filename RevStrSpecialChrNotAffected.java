package github;

//import java.util.*;

public class RevStrSpecialChrNotAffected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "a,s$d";
		
		char arr[]=a.toCharArray();
		
		int j=0;
		for(int i=a.length()-1;i>=0;i--) {
			if(arr[i]>=65 && arr[i]<=90 || arr[i]>=97 && arr[i]<=122) {
				j++;
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[j]);
				j++;
			}
			
		}
		
		

	}

}
