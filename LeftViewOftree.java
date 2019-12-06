package github;

public class LeftViewOftree {
	
	static Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	public static void bot(Node root,int hd) {
		if(root==null) {
			return ;
		}
		if(hd==0) {
			System.out.print(root.data+" ");
		}
		bot(root.left, 0);
		bot(root.right, 1);
	}
	public static void LeftView(Node root) {
		
		bot(root.left, 0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root=new Node(10);
		root.left=new Node(20);
		root.left.left=new Node(30);
		root.left.left.left=new Node(40);
		root.left.left.right=new Node(50);
		root.left.left.right.right=new Node(60);
		root.left.left.right.right.left=new Node(70);
		
		LeftView(root);

	}

}
