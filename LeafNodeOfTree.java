package github;

public class LeafNodeOfTree {
	
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
	public static void LeafNode(Node root) {
		
		if(root==null) {
			return ;
		}
		if(root.left==null && root.right==null) {
			System.out.print(root.data+" ");
		}
		
		LeafNode(root.left);
		LeafNode(root.right);
		
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
		root.right.right.right=new Node(8);
		
		LeafNode(root);
		
	}

}
