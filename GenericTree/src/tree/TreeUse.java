package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {
	
	// take input recursively 
	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in) ; 
		Queue <TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
		
		System.out.print("Enter the root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null ; 
		}
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData) ; 
		pendingNodes.add(root) ; 
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.poll() ; 
			System.out.print("Enter the number of children for : " + front.data);
			int numChild = s.nextInt() ; 
			for(int i = 0 ; i < numChild ; i++ ) {
				System.out.println("Enter the "+ i + " th child data for : " + front.data );
				int childData = s.nextInt() ; 
				TreeNode<Integer>  childNode = new  TreeNode<Integer>(childData) ; 
				front.child.add(childNode) ; 
				pendingNodes.add(childNode);
			}
			
		}
		
		return root;
		 
	}
	
	// calculate the total number of nodes in genric tree 
	public static int numOfNodes(TreeNode<Integer> root ) {
		int count = 1 ; 
		
		for(int i = 0 ; i < root.child.size() ; i++ ) {
			int childCount = numOfNodes(root.child.get(i)) ; 
			count += childCount ; 
		}
		return count;
	}
	
	// print tree in detailed manner
	public static void printTreeDetailed(TreeNode<Integer> root ) {
		
		// special case but not base case 
		if(root == null) {
			return ; 
		}
		
		System.out.print(root.data + ":") ;
		for(int i = 0 ; i < root.child.size() ; i++) {
			System.out.print(root.child.get(i).data + " ");
		}
		System.out.println(); 
		for(int i = 0 ; i < root.child.size() ; i++ ) {
			TreeNode<Integer> child1 = root.child.get(i) ; 
			printTreeDetailed(child1) ; 
		}
	}
	
	// print tree in pre order way 
	public static void printTree(TreeNode<Integer> root ) {
		
		System.out.print(root.data + " ") ;
		for(int i = 0 ; i < root.child.size() ; i++ ) {
			TreeNode<Integer> child1 = root.child.get(i) ; 
			printTree(child1) ; 
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeNode<Integer> root = new TreeNode<>(4) ; 
//		
//		TreeNode<Integer> node1 = new TreeNode<>(2) ; 
//		TreeNode<Integer> node2 = new TreeNode<>(3) ; 
//		TreeNode<Integer> node3 = new TreeNode<>(1) ; 
//		TreeNode<Integer> node4 = new TreeNode<>(5) ; 
//		TreeNode<Integer> node5 = new TreeNode<>(6) ; 
//	
//	    root.child.add(node1);
//	    root.child.add(node2);
//	    root.child.add(node3);
//	    
//	    node2.child.add(node4);
//	    node2.child.add(node5);
	    
	    TreeNode<Integer> root = takeInputLevelWise();	   
//	    printTree(root) ; 
//	    System.out.println() ; 
        printTreeDetailed(root) ; 
	
//	    System.out.print(numOfNodes(root));
	}

}
