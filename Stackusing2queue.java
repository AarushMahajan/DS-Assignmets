package stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stackusing2queue {
	
	static Queue<Integer> q1 = new LinkedList<>();
	static Queue<Integer> q2 = new LinkedList<>();
	
	public static void push(int a) {
		q1.add(a);
	}
	
	public static void pop() {

			int count=0;
			int n=q1.size()-1;
			while(count!=n) {
				q2.add(q1.poll());
				count++;
			}
		
		
		System.out.print(q1.poll()+" ");
		
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(1);
		push(2);
		push(3);
		pop();
		pop();
		push(4);
		pop();
		pop();
		
//		System.out.println(q1);

	}

}
