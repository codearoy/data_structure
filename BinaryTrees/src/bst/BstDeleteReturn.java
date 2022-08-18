package bst;

import binaryTrees.BinaryTreeNode;

public class BstDeleteReturn {

	BinaryTreeNode<Integer> root ;
	boolean deleted ; 
	
	public BstDeleteReturn(BinaryTreeNode<Integer> root , boolean deleted) {
		
		this.root = root; 
		this.deleted = deleted ; 
		
	}
}
