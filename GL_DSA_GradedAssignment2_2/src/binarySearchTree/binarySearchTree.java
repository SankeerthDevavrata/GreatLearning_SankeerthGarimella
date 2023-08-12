package binarySearchTree;

public class binarySearchTree {
	
	public binarySearchTree root;
	
	public int data;
	public binarySearchTree parent;
	public binarySearchTree left;
	public binarySearchTree right;
	
	public binarySearchTree() {
		root=null;
	}
	public binarySearchTree(int data){
		this.data=data;
		this.left=null;
        this.right = null;
        this.parent = null;
	}
	
	public void insertNode(binarySearchTree node,int data) {
		if(node==null) {
			node = new binarySearchTree(data);
			root=node;
		}
		else if(data<node.data && node.left==null){
			node.left=new binarySearchTree(data);
			node.left.parent=node;
		}
		else if(data>=node.data && node.right==null){
			node.right=new binarySearchTree(data);
			node.right.parent=node;
		}
		else {
			if(data<node.data) insertNode(node.left,data);
			else insertNode(node.right,data);
		}
	}
	
	
}
