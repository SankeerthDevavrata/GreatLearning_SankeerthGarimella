package operations;

import java.util.*;
import binarySearchTree.binarySearchTree;

public class twoSum {
	public static boolean findTwoSum(binarySearchTree node,int sum,Set<Integer> set) {
		if(node==null) {
			return false;
		}
		if(findTwoSum(node.left,sum,set)) {
			return true;
		}
		if(set.contains(sum-node.data)) {
			System.out.println("Pair is found: ("+(sum-node.data)+","+node.data+")");
			return true;
		}else {
			set.add(node.data);
		}
		
		return findTwoSum(node.right,sum,set);
	}
	
	public static void twoSumBST(binarySearchTree node,int sum) {
		Set<Integer> set=new HashSet<>();
		boolean result=findTwoSum(node,sum,set);
		if(!result) System.out.println("Pair not found");
		
	}
}
