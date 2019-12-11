package linckedList;

public class LinkedLists {
	 Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static LinkedLists insert(LinkedLists li,int data)
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
	public static LinkedLists addBeg(LinkedLists li,int data)
	{
		Node n1 =new Node(data);
		n1.next=null;
		if(li.head==null)
		{
			li.head=n1;
		}
		else
		{
			Node n2=li.head;
			li.head=n1;
			n1.next=n2;
		}
		return li;
	}
	public static LinkedLists deleteLast(LinkedLists l1)
	{
		Node current=l1.head;
		while(current.next.next!=null)
		{
			current=current.next;
		}
		current.next=null;
		
		return l1;
		}
	public static LinkedLists deleteFirst(LinkedLists li)
	{
		Node current=li.head;
		li.head=current.next;
		return li;
	}
	
	public static LinkedLists insertAtIndex(LinkedLists li,int data,int index)
	{
		Node current=li.head;
		Node newNode=new Node(data);
		
		int count1=0;
		while(current.next!=null) {
			
			if(index==0) {
				Node a=newNode;
				li.head=a;
				newNode.next=current;
				break;
			}
			else if(count1==index-1) {
				Node a=newNode;
				newNode.next=current.next;
				current.next=a;
				break;
			}
			current=current.next;
			count1++;
		}
		
		return li;
	}
	
	public static void display(LinkedLists l1)
	{
		Node currNode=l1.head;
		while(currNode.next!=null)
		{
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
		System.out.println(currNode.data);
	}
	public static LinkedLists rev(LinkedLists li)
	{
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
		return li;
		
	}
	public static void main(String args[])
	{
		LinkedLists obj=new LinkedLists();
		obj=obj.insert(obj, 10);
		obj=obj.insert(obj, 20);
		obj=obj.insert(obj, 30);
		obj=obj.insert(obj, 40);
		obj=obj.insert(obj, 50);
//		obj=obj.rev(obj);
//		obj=obj.addBeg(obj, 5);
//		obj=obj.deleteLast(obj);
//		obj.deleteFirst(obj);
//		obj.insertAtIndex(obj,100,0);
		obj.display(obj);
	}

}
