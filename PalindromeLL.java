package github;

import java.util.Scanner;

public class PalindromeLL {
	
	 Node head;
		
		class Node{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
				next=null;
			}
		}
		public PalindromeLL insert(PalindromeLL li,int data)
		{
			Node n1 =new Node(data);
			n1.next=null;
			if(li.head==null)
			{
				li.head=n1;
			}
			else// appending data at end
			{
				Node last=li.head;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=n1;
			}
			return li;
		}
		public void display(PalindromeLL li)
		{
			Node currNode=li.head;
			while(currNode.next!=null)
			{
				System.out.println(currNode.data);
				currNode=currNode.next;
			}
			System.out.print(currNode.data);
		}
		
		public void clon(PalindromeLL li) {
			
			PalindromeLL fi=new PalindromeLL();
			
			Node currNode=li.head;
			while(currNode.next!=null)
			{
				insert(fi, currNode.data);
				currNode=currNode.next;
			}
			insert(fi, currNode.data);
			
			
			//reverse
			Node N=null;
			while(true)
			{
				Node current=li.head;
			while(current.next!=N)
			{
				int temp=current.data;
				current.data=current.next.data;
				current.next.data=temp;
				
				current=current.next;
			}
			 N=current;
			if(N==li.head)
				break;
			}
			
			int f=0;
			Node current=li.head;
			Node aa=fi.head;
			while(current!=null)
			{
				if(current.data==aa.data)
				{
					f=1;
				}
				else {
					System.out.println("No :(");
					f=0;
					break;
				}
					current=current.next;
					aa=aa.next;
			}
			if(f==1)
				System.out.println("Yeeeppiiiii !!!!!!");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeLL li =new PalindromeLL();
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		int x=0;
		for(int i=0;i<n;i++) {
			
			x=sc.nextInt();
			
			li.insert(li, x);
			
		}
		
		li.clon(li);
		
		sc.close();
	}

}
