package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
	
	// print nodes at depth k 
	public static void nodeAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return ; 
		}
		
		if(k==0) {
			System.out.print(root.data + " ");
			return ;
			
		}
		nodeAtDepthK(root.left  , k-1);
		nodeAtDepthK(root.right , k-1);
		
		
 	}
	
	
	// NumOfleaf
	public static int numLeaf(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0 ; 
		}
		
		if(root.left == null && root.right == null) {
			return  1 ; 
		}
		
		return  numLeaf(root.left) + numLeaf(root.right) ;
		
 	}

	
	// find the largest node data 
	public static int largest(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return -1 ; 
		}
		
		int largestLeft = largest(root.left) ; 
		int largestRight = largest(root.right) ; 
		return Math.max(root.data , Math.max(largestLeft, largestRight)) ; 
 	}

	
	
	//Number of Nodes in a Tree 
	public static int numNodes(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0 ; 
		}
		
		int leftCount = numNodes(root.left) ; 
		int rightCount = numNodes(root.right) ; 
		
		
		return leftCount + rightCount + 1 ; 
	}
	
	
	// take input better 
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot , int parentData , boolean isLeft ){
		if(isRoot) {
			System.out.println("Enter root data" ) ; 
			
		}else {
			if(isLeft) {
				System.out.println("Enter left data of " + parentData);
			}else {
				System.out.println("Enter Right data of " + parentData);
			}
		}
		Scanner s = new Scanner(System.in) ; 
		int rootData = s.nextInt() ; 
		
		if(rootData == -1) {
			return null; 
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData) ;
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false , rootData , true ) ; 
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false , rootData , false) ; 
		root.left = leftChild ; 
		root.right = rightChild; 
		return root ; 
		
	}
	
	// take input ;
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter root data" ) ; 
		Scanner s = new Scanner(System.in) ; 
		int rootData = s.nextInt() ; 
		
		if(rootData == -1) {
			return null; 
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData) ; 
		BinaryTreeNode<Integer> leftChild = takeTreeInput() ; 
		BinaryTreeNode<Integer> rightChild = takeTreeInput() ; 
		root.left = leftChild ; 
		root.right = rightChild; 
		return root ; 
		
	}
	
	// print detailed binary tree 
	public static void printBinaryTreeDetailed(BinaryTreeNode<Integer> root) {
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
		
		printBinaryTreeDetailed(root.left) ; 
		printBinaryTreeDetailed(root.right) ; 
	
	}
	
	// print binary tree  
	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
		//  take care of base case 
		if(root == null) {
			return ;
		}
		
		System.out.println(root.data) ;
		printBinaryTree(root.left) ; 
		printBinaryTree(root.right) ; 
		
		
//		if(root.left !=null) {
//			printBinaryTree(root.left) ; 
//		}
//		if(root.right != null) {
//		printBinaryTree(root.right) ; 
//	
//		}
	}
	
	// remove leaves 
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null ; 
		}
		
		if(root.left == null && root.right == null) {
			return null; 
		}
		
		root.left = removeLeaves(root.left) ;
		root.right = removeLeaves(root.right) ;
		return root ;
		
	}
	
	
	// is balance better 
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int height = 0 ;
			boolean isBal = true; 
			BalancedTreeReturn ans = new BalancedTreeReturn() ; 
			ans.height = height; 
			ans.isBalanced = isBal; 
			return ans ;
		}
		
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left) ; 
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right) ; 
		
		boolean isBal = true; 
		int height = 1 + Math.max(leftOutput.height , rightOutput.height);
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1 ) {
			isBal = false ;
		}
		
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false ; 
		}
		
		BalancedTreeReturn ans = new BalancedTreeReturn() ;
		ans.height = height ; 
		ans.isBalanced = isBal; 
		return ans; 
		
	}
	
	// isBalanced 
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			 return true; 
		}
		
		int leftHeight = height(root.left) ; 
		int rightHeight = height(root.right) ;
		
		if(Math.abs(leftHeight - rightHeight) > 1 ) {
			return false ; 
		}
		
		boolean isLeftBalanced = isBalanced(root.left) ;
		boolean isRightBalanced = isBalanced(root.right) ; 
		
		return isLeftBalanced && isRightBalanced  ;
	}
	
  // height of node 
	private static int height(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return 0 ; 
		}
		
		int leftHeight = height(root.left) ; 
		int rightHeight = height(root.right) ;
		
		return 1 + Math.max(leftHeight , rightHeight);
	}

	// Diameter of tree max distance between two farthest node 
	
	
	
	// level wise taking input 
	public static BinaryTreeNode<Integer>  takeInputLevelWise(){
		Scanner s = new Scanner(System.in)  ; 
		System.out.print("Enter root data");
		int rootData = s.nextInt() ; 
		
		if(rootData == -1) {
			return null  ;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData) ; 
		
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>() ;
		pendingChildren.add(root) ;
		while(!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();	
	     	System.out.print("Enter left Child of " + front.data);
	     	int left = s.nextInt() ; 
	     	if(left != -1 ) {
	     		BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer> (left)  ; 
	     		front.left = leftChild ; 
	     		pendingChildren.add(leftChild) ; 
	     	}
	     	
	     	System.out.print("Enter right Child of " + front.data);
	     	int right = s.nextInt() ; 
	     	if(right != -1 ) {
	     		BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer> (right)  ; 
	     		front.right = rightChild ; 
	     		pendingChildren.add(rightChild) ; 
	     	}
 			
		}
	
		return root; 
	}
	
	// print level wise 
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>() ; 
       if(root != null) {
    	   q.add(root)  ; 
    	   while(!q.isEmpty()) {
    		   BinaryTreeNode<Integer> tNode = q.poll() ; 
    		   System.out.print(tNode.data + " ");
    		   if(tNode.left != null) {
    			   BinaryTreeNode<Integer> leftChild = tNode.left ; 
    			   q.add(leftChild) ; 
    		   }
    		   if(tNode.right != null) {
    			   BinaryTreeNode<Integer> rightChild = tNode.right ; 
    			   q.add(rightChild) ; 
    		   }
    	   }
       }
		
	}
	
	public static BinaryTreeNode<Integer> buildTreeFromPostInHelper(int[] post , int[] in , int siPost , int eiPost , int siIn , int eiIn){
		if(siPost > eiPost) {
			return null; 
		}
		
		int rootData = post[eiPost];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData) ; 
		
		int rootIndex = -1 ; 
		for(int i= siIn ; i <=eiIn ; i++ ) {
			if(in[i] == rootData ) {
				rootIndex = i ; 
				break ; 
			}
		}
		
		int siPostLeft  = siPost ; 
		int siInLeft = siIn;
		int eiInLeft = rootIndex - 1 ;
		int siInRight = rootIndex + 1 ;
		int eiPostRight = eiPost - 1  ; 
		int eiInRight = eiIn ;
		
		int leftSubtreeLength = eiInLeft - siInLeft + 1 ;
		int eiPostLeft = siPostLeft + leftSubtreeLength - 1 ; 
		int siPostRight = eiPostLeft + 1  ;
		
		
		BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(post , in , siPostLeft , eiPostLeft , siInLeft , eiInLeft );
		BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(post , in , siPostRight , eiPostRight , siInRight , eiInRight);
		root.left = left ; 
		root.right = right ;
		
		return root ;
		}
	
	// build tree from postOrder and inOrder 
	public static BinaryTreeNode<Integer> buildTreeFromPostIn(int[] post , int[] in){
		BinaryTreeNode<Integer> root = buildTreeFromPostInHelper(post , in ,0 , post.length - 1 , 0  , in.length - 1  ) ;
		return root ;
	}
	
	
	// helper functioln for buildTreeFromPreIn
	public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int[] pre , int[] in , int siPre , int eiPre , int siIn , int eiIn){
		if(siPre > eiPre) {
			return null; 
		}
		
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData) ; 
		
		int rootIndex = -1 ; 
		for(int i= siIn ; i <=eiIn ; i++ ) {
			if(in[i] == rootData ) {
				rootIndex = i ; 
				break ; 
			}
		}
		
		int siPreLeft  = siPre + 1 ; 
		int siInLeft = siIn;
		int eiInLeft = rootIndex - 1 ;
		int siInRight = rootIndex + 1 ;
		int eiPreRight = eiPre ; 
		int eiInRight = eiPre ;
		
		int leftSubtreeLength = eiInLeft - siInLeft + 1 ;
		int eiPreLeft = siPreLeft + leftSubtreeLength -1 ; 
		int siPreRight = eiPreLeft + 1  ;
		
		
		BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre , in , siPreLeft , eiPreLeft , siInLeft , eiInLeft );
		BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre , in , siPreRight , eiPreRight , siInRight , eiInRight);
		root.left = left ; 
		root.right = right ;
		
		return root ;
		}
		
	// find binarytree using inOrdr and preorder of given data in arr 
	
	public static BinaryTreeNode<Integer> buildTreeFromPreIn(int[] pre , int[] in){
		BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre , in ,0 , pre.length - 1 , 0  , in.length - 1  ) ;
		return root ;
	}
	
	
	
	public static void main(String[] args) {
		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1) ; 
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2) ; 
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3) ; 
//		root.left = rootLeft ; 
//		root.right = rootRight; 
//		
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4) ; 
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5) ; 
//		
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft; 
//		BinaryTreeNode<Integer> root = takeTreeInputBetter(true , 0 , false);
//		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		printLevelWise(root) ; 
//		printBinaryTreeDetailed(root) ; 
//		System.out.println(numNodes(root));
//		System.out.println("largest" + largest(root));	
//		System.out.println("num of leaf" + numLeaf(root));
//		nodeAtDepthK(root, 1) ; 
//		System.out.println("isBalanced " + isBalanced(root));
//		
//		
		int in[] = {} ;
		int pre[] = {} ; 
		BinaryTreeNode<Integer> root =  buildTreeFromPreIn(pre , in);
		printBinaryTreeDetailed(root) ; 
  		
	}


}
