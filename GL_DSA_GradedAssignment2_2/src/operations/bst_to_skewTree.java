package operations;

import binarySearchTree.binarySearchTree;

public class bst_to_skewTree {
	
	binarySearchTree prevNode = null;
	public binarySearchTree headNode = null;
	
	public bst_to_skewTree(){}
	
	public void skewTree(binarySearchTree node) {
		
		if (node==null) return;
		
		skewTree(node.left);
		
		if(headNode == null)
        {
            headNode = node;
            node.left = null;
            prevNode = node;
        }
        else
        {
            prevNode.right = node;
            node.left = null;
            prevNode = node;
        }
		
		skewTree(node.right);
	}
	
	public void traverseRightSkewed(binarySearchTree root)
    {
		
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        traverseRightSkewed(root.right);       
    }

}
