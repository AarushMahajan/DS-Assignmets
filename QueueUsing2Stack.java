package github;

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
