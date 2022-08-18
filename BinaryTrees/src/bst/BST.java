package bst;

import binaryTrees.BinaryTreeNode;

public class BST {

	private BinaryTreeNode<Integer> root; 
	private int size ; 
	
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node , int x) {
	
		if(node == null) {
			return false ;
		}
		
		if(node.data == x) {
			return true ; 
		}
		
		if(x  < node.data ) {
			// call on left side
			return isPresentHelper(node.left , x ) ; 
		}else {
			// else call on right side 
			return  isPresentHelper(node.right , x ) ; 
		}
		
	}
	
	public boolean isPresent(int x) {
		
		return isPresentHelper(root , x) ;
	}
	
	
	private static  BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node , int data) {
		
		if(node == null) {
			BinaryTreeNode<Integer> newNode = new  BinaryTreeNode<Integer>(data) ; 
			return newNode ; 
		}else if(node.data <= data ) {
			BinaryTreeNode<Integer> rightRoot = insertHelper(node.right , data) ; 
			node.right = rightRoot ;
		}else {
			BinaryTreeNode<Integer> leftRoot = insertHelper(node.right , data) ; 
			node.left = leftRoot ;
		}
		
		return node;	
	}
    
	public void insert(int x) {
		root = insertHelper(root , x) ; 
		size++ ; 
	}
	
	
	// minimum node to help in delete method 
	private static int minimum(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return Integer.MAX_VALUE ; 
		}
		
		int minimumLeft = minimum(root.left) ; 
		int minimumRight = minimum(root.right) ; 
		return Math.min(root.data , Math.min(minimumLeft, minimumRight)) ; 
 	}
	
	private static BstDeleteReturn deleteHelper(BinaryTreeNode<Integer> root, int x){
		
		// root is null
		if(root == null) {
			return new BstDeleteReturn(null , false ) ; 
		}
		
		// root data in right side 
		if(root.data < x) {
			BstDeleteReturn outRight = deleteHelper(root.right , x ) ; 
			root.right = outRight.root ; 
			outRight.root  = root ; 
			return outRight ; 
		}
		
		// root data in left side 
		if(root.data > x) {
			BstDeleteReturn outLeft = deleteHelper(root.left , x ) ; 
			root.left = outLeft.root ; 
			outLeft.root  = root ; 
			return outLeft ; 
		}
		
		// if root data equal to data then we have three cases 
	
		// 0 CHILDREN 
		if(root.left == null && root.right == null ) {
			
			return new BstDeleteReturn(null , true ) ; 
			
		}
		
		
		// Only 1 children is present 
		if(root.left != null &&  root.right == null) {
			return new BstDeleteReturn(root.left , true ) ; 
		}

		if(root.right != null &&  root.left == null) {
			return new BstDeleteReturn(root.right , true ) ; 
		}
		
		// both children are present 
		int rightMin = minimum(root.right) ; 
		root.data = rightMin ; 
		BstDeleteReturn outRight = deleteHelper(root.right, rightMin) ; 
		root.right = outRight.root ; 
		return  new BstDeleteReturn(root , true ) ; 
		
	}
	
	
	// delete data 
	public boolean deleteData(int x) {
	    BstDeleteReturn output = deleteHelper(root , x) ;
	    root = output.root ; 
	    if(output.deleted) {
	    	size--; 
	    }
	    return output.deleted ; 
	}
	
	public int size() {
		return size ; 
	}
	
	// print helper 
	private static void printTreeHelper(BinaryTreeNode<Integer> root) {
		
	//  take care of base case 
				if(root == null) {
					return ;
				}
				
				System.out.print(root.data + ":" ) ;
				if(root.left != null) {
					System.out.print("L" + root.left.data + ", " );
				}
				
				if(root.right != null) {
					System.out.print("R" + root.right.data);
				}
				System.out.println() ; 
				
				printTreeHelper(root.left) ; 
				printTreeHelper(root.right) ; 
		
	}
	
	public void printTree() {
		printTreeHelper(root) ; 
	}
	
	
	
	
}
