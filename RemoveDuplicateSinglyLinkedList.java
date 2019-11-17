package github;

public class RemoveDuplicateSinglyLinkedList {
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
	public RemoveDuplicateSinglyLinkedList insert(RemoveDuplicateSinglyLinkedList li,int data)
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
	public static void display(RemoveDuplicateSinglyLinkedList l1)
	{
		Node currNode=l1.head;
		while(currNode.next!=null)
		{
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.print(currNode.data);
	}
	
	public static void duplicate(RemoveDuplicateSinglyLinkedList li) {
		int count=0;
		
		Node current=li.head;
		while(current.next!=null) {
			
			int a=current.data;
			Node ne=current.next;
			Node temp=current;
			
			while(ne!=null) {
				
				int b=ne.data;
				
				if(a==b) {
					count++;
					temp.next=ne.next;
				}
				else {
					temp=temp.next;
				}
				ne=ne.next;
			}
			current=current.next;
		}
		
		
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	RemoveDuplicateSinglyLinkedList obj=new RemoveDuplicateSinglyLinkedList();
	obj.insert(obj, 10);
	obj.insert(obj, 20);
	obj.insert(obj, 20);
	obj.insert(obj, 30);
	obj.insert(obj, 20);
	obj.insert(obj, 20);
	
	obj.duplicate(obj);
	obj.display(obj);

}

}
