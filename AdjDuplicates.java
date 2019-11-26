package github;

import java.util.Scanner;
class AdjDuplicates
{
static String s= "";
	
	public static void re_dup(char str[] , int i) {
		
		 if(i==str.length-1) {
			 if(str[i]!=str[i-1]) {
				 s=s+str[i];
			 }
				return ;
			}
		if(i==0) {
			s=s+str[i];
		}
		if( i!=0 && str[i]!=str[i+1] && str[i]!=str[i-1]) {
			s=s+str[i];
		}
		
			re_dup(str, i+1);
		
	}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
str=sc.next();
re_dup(str.toCharArray(),0);
System.out.println(a);
}
}
