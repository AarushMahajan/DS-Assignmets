package github;

public class CheckIfBst {
	
	static Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	
	public static boolean BST(Node root) {
		
		if(root.left==null && root.right==null) {
			return true;
		}
		else if(root.data < root.left.data || root.data > root.right.data) {
			return false;
		}
		
			boolean x =  BST(root.left);
			boolean	x1 = BST(root.right);
			
			if(x==false) {
				return false;
			}
			else if(x1==false) {
				return false;
			}
			else {
				return true;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(12);

		boolean x = BST(root);
		
		if(x){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

	}

}
