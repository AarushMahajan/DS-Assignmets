package github;

public class Queueusing2stacks {

	Node head;
	static class Node{
		int data;
		Node next;package queue;
import java.util.*;

public class QueueUsing2Stack {
	
	static Stack<Integer> s = new Stack<Integer>();
	static Stack<Integer> s1 = new Stack<Integer>();
	
	public static void enqueue(int a) {
		s.push(a);
	}
	public static void dequeue() {
		
		if(s1.empty()) {
			while(!s.empty()) {
				s1.push(s.pop());
				}
		}
			
			System.out.println(s1.pop());
			
			while(!s1.empty()) {
				s.push(s1.pop());
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		dequeue();
		dequeue();
		enqueue(5);
		enqueue(6);
		enqueue(7);
		dequeue();
		dequeue();
		dequeue();
		
		
		
//		System.out.println(s1);
		
	}

}

		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void enqueue(Queueusing2stacks s , int d) {
		
		Node n1 =new Node(d);
		n1.next=null;
		if(s.head==null)
		{
			s.head=n1;
		}
		else
		{
			Node n2=s.head;
			s.head=n1;
			n1.next=n2;
		}
			
	}
	
	public static void dequeue(Queueusing2stacks s) {
		
		Queueusing2stacks s1=new Queueusing2stacks();
		Node current=s.head;
		
		while(current!=null) {
		 s1.enqueue(s1, current.data);
		 current=current.next;
		}
		Node a=s1.head;
		while(a!=null) {
			System.out.println(a.data);
			a=a.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueusing2stacks s =new Queueusing2stacks();
		
		enqueue(s, 10);
		enqueue(s, 20);
		enqueue(s, 30);
		enqueue(s, 40);
		
		dequeue(s);
		
	}

}

