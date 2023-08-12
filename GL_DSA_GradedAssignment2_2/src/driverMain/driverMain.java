package driverMain;

import java.util.Scanner;

import binarySearchTree.binarySearchTree;
import operations.bst_to_skewTree;

public class driverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		binarySearchTree BST = new binarySearchTree();
		
		BST.insertNode(BST.root,50);
		BST.insertNode(BST.root,30);
		BST.insertNode(BST.root,60);
		BST.insertNode(BST.root,10);
		BST.insertNode(BST.root,55);
		BST.insertNode(BST.root,50);
		BST.insertNode(BST.root,70);
		
		bst_to_skewTree BST_skewTree = new bst_to_skewTree();
		BST_skewTree.skewTree(BST.root);
		
		System.out.println("Skew Tree of given BST : ");
		BST_skewTree.traverseRightSkewed(BST_skewTree.headNode);
		
		sc.close();

	}

}
