package driverMain;

import operations.twoSum;
import binarySearchTree.binarySearchTree;
import java.util.Scanner;

public class driverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		binarySearchTree findSumBST = new binarySearchTree();
		findSumBST.insertNode(findSumBST.root,40);
		findSumBST.insertNode(findSumBST.root,20);
		findSumBST.insertNode(findSumBST.root,60);
		findSumBST.insertNode(findSumBST.root,10);
		findSumBST.insertNode(findSumBST.root,30);
		findSumBST.insertNode(findSumBST.root,50);
		findSumBST.insertNode(findSumBST.root,70);
		
		System.out.println("Enter the sum to find in BST:");
		int sum=sc.nextInt();
		
		twoSum.twoSumBST(findSumBST.root,sum);

		
		sc.close();
	}

}
