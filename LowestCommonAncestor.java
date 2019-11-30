package github;

import java.util.*;
class LowestCommonAncestor
{   
    public static Node root;
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node LCA(Node root,int a,int b)
    {
        if(root==null||root.data==a||root.data==b)
            return root;
        Node l=LCA(root.left,a,b);
        Node r=LCA(root.right,a,b);
        if(l!=null && r!=null)
            return root;
        return l!=null ? l:r;
    }
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    LowestCommonAncestor t1=new LowestCommonAncestor();
    t1.root=new Node(1);
    t1.root.left=new Node(2);
    t1.root.right=new Node(3);
    t1.root.left.left=new Node(4);
    t1.root.left.right=new Node(5);
    t1.root.right.left=new Node(6);
    t1.root.right.right=new Node(7);
    System.out.println("Enter Nodes values:");
    int a1=obj.nextInt();
    int b1=obj.nextInt();
    Node n1=t1.LCA(t1.root,a1,b1);
    System.out.println("LCA of ("+a1 +", "+b1+") is"+n1.data);
}
}