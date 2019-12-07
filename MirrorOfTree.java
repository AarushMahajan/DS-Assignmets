package github;

public class MirrorOfTree {
	
	static Node root;
	static Node root1;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	public static boolean Mirror(Node root,Node root1) {
		
		if(root==null || root1==null) {
			return true;
		}
		if(root.data==root1.data) {
			return Mirror(root.left, root1.right) && Mirror(root.right, root1.left);
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		root1=new Node(1);
		root1.left=new Node(3);
		root1.right=new Node(2);
		root1.left.left=new Node(7);
		root1.left.right=new Node(6);
		root1.right.left=new Node(5);
		root1.right.right=new Node(4);
		
		System.out.println(Mirror(root, root1));

	}

}
