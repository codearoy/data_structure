package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import binaryTrees.BinaryTreeNode;

public class BSTUse{

	// check if tree is BST 
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true ;
		}
		
		int leftMax = maximum(root.left) ;
		if(leftMax >= root.data) {
			return false ;
		}
		
		int rightMin = minimum(root.right) ; 
		if(rightMin < root.data) {
			return false ;
		}
		
		boolean isLeftBST = isBST(root.left) ; 
		boolean isRightBST = isBST(root.right) ; 
		
		return isLeftBST && isRightBST ; 
		
	}
	
	
	//maximum  node data 
	public  static int maximum(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return Integer.MIN_VALUE ; 
		}
		int leftMax = maximum(root.left) ; 
		int rightMax = maximum(root.right) ; 
		
		return Math.max(root.data, Math.max(leftMax, rightMax));

	}



	public static int minimum(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return Integer.MAX_VALUE ; 
		}
		
		int leftMin = minimum(root.left) ; 
		int rightMin = minimum(root.right) ; 
		
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}



	// Search in bst using recursion 
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root == null){
			return false ; 
        }
        
        if(root.data == k){
            return true; 
        }else if(root.data > k){
            return searchInBST(root.left, k ) ; 
        }else return searchInBST(root.right, k ) ; 
        
        
	}
	
	// build bst using sorted array 
	 public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int si , int ei){
		   if(si > ei){
             return null; 
         }

         int mid = (si+ei) / 2  ; 
          
         BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]) ; 
         
         BinaryTreeNode<Integer> left = SortedArrayToBSTHelper(arr, si , mid-1) ; 
         BinaryTreeNode<Integer> right = SortedArrayToBSTHelper(arr , mid+1 , ei) ; 
 
        root.left = left; 
        root.right = right; 
 
        return root ; 
 
     }
	 
	 //  
	  public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			
		  return SortedArrayToBSTHelper(arr, 0 , n-1 ) ; 
		  
		}
	
	  // print detailed
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
	
	  
	  
	 // path to find data 
	 public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root , int x){
		 if(root == null) {
			 return null; 
		 }
		 
		 if(root.data == x) {
			 ArrayList<Integer> output = new ArrayList<Integer>() ; 
			 output.add(root.data) ; 
			 return output ; 
		 }
		 
		 ArrayList<Integer> leftOutput = nodeToRootPath(root.left , x) ;
		 if(leftOutput != null) {
			 leftOutput.add(root.data) ; 
			 return leftOutput ; 
		 }
		 
		 ArrayList<Integer> rightOutput = nodeToRootPath(root.right , x) ;
		 if(rightOutput != null) {
			 rightOutput.add(root.data) ; 
			 return rightOutput ; 
		 }
		 
		return null;
	 }
	 
	 // is Bst 2 function in optimised way 
	 public static IsBSTReturn isBST2( BinaryTreeNode<Integer> root ) {
		 if(root == null) {
			 IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE , Integer.MIN_VALUE , true ) ;
			 return ans ;
		 }
		 
		 IsBSTReturn leftAns = isBST2(root.left) ; 
		 IsBSTReturn rightAns = isBST2(root.right) ;
		 
		 int min = Math.min(root.data , Math.min(leftAns.min, rightAns.min)) ; 
		 int max = Math.max(root.data , Math.max(leftAns.max, rightAns.max)) ;
		 
		 boolean isBST = true ;
		 if(leftAns.max >= root.data || rightAns.min < root.data || leftAns.isBST == false || rightAns.isBST==false  ) {
			 isBST = false ;
		 }
		 
		 IsBSTReturn ans = new IsBSTReturn(min , max , isBST) ; 
		 return ans ; 
		 
	 }
	 
// is bst 3 using range method 
	 public static boolean isBST3(BinaryTreeNode<Integer> root ,int minRange , int maxRange) {
		 
		 if(root == null) {
			 return true ;
		 }
		 
		 if(root.data < minRange || root.data > maxRange ) {
			 return false ;
		 }
		 
		 boolean isLeftWithinRange = isBST3(root.left ,  minRange  , root.data - 1) ; 
		 boolean isRightWithinRange = isBST3(root.right , root.data , maxRange) ; 
		return isLeftWithinRange && isRightWithinRange ;
		 
	 }
	 
	 // convert bst to an sorted arr 
	 public static int[] bstToArr(BinaryTreeNode<Integer> root ){
		 
		 	if(root == null) {
		 		int[] ans = new int[0] ; 
		 		return ans ; 
		 	}
		 
	        if(root.left == null && root.right == null){
	            int[] ans = new int[1] ;
	            ans[0] = root.data ; 
	            return ans ; 
	        }
	        
	        int[] leftArr = bstToArr(root.left) ; 
	        int[] rightArr = bstToArr(root.right) ; 
	        
	        int[] ans = new int[leftArr.length + rightArr.length + 1] ; 
	        
	        for(int i = 0 ; i < leftArr.length ; i++){
	            ans[i] = leftArr[i] ; 
	        }
	        
	        ans[leftArr.length] = root.data ;
	        
	        for(int i = 0; i < rightArr.length ; i++){
	            ans[i + leftArr.length + 1] = rightArr[i] ; 
	        }
	        
	        return ans ; 
	    }
	 
	 // print the pair sum of node which sum equal to s 
	 public static void pairNode(BinaryTreeNode<Integer> root , int s) {
		 Stack<BinaryTreeNode<Integer>> s1 = new Stack<BinaryTreeNode<Integer>>() ; 
		 Stack<BinaryTreeNode<Integer>> s2 = new Stack<BinaryTreeNode<Integer>>() ; 
		 
		 BinaryTreeNode<Integer> t = root ; 
		 while(t.left != null) {
			 s1.push(t) ; 
			 t = t.left ; 
		 }
		 
		 BinaryTreeNode<Integer> u = root ;
		 while(u.right != null) {
			 s2.push(u) ; 
			u = u.right ; 
		 }
		 
		 while(!s1.isEmpty() && !s2.isEmpty()) {
			 if(s1.peek().data + s2.peek().data == s) {
				 System.out.println(Math.min(s1.peek().data, s2.peek().data) + " " + Math.max(s1.peek().data, s2.peek().data));
				 s1.pop(); 
				 s2.pop(); 
				 
			 }else if(s1.peek().data + s2.peek().data > s) {
				 BinaryTreeNode<Integer> r = s2.peek().left ;
				 s2.pop() ; 
				 while(r != null) { 
					 s2.push(r) ; 
					 r = r.right ;  
				 }
				 
			 }else {
				 BinaryTreeNode<Integer> r = s1.peek().right ;
				 s1.pop() ; 
				 while(r != null) { 
					 s2.push(r) ; 
					 r = r.left ;  
				 }
			 }
		 } 
			  
	 }
	 
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8} ; 
		
		 BinaryTreeNode<Integer> root  = SortedArrayToBST( arr, arr.length ) ; 		
		// printBinaryTreeDetailed(root) ; 
		// System.out.println(isBST(root));
		 
//
//		 System.out.println(isBST3(root,Integer.MIN_VALUE , Integer.MAX_VALUE )) ;  
//		 ArrayList<Integer> path = nodeToRootPath(root , 5) ;
//		 for(int i : path ) {
//			 System.out.println(i);
//		 }
		 
//		 int[] newAns = bstToArr(root) ; 
//		 for(int i = 0 ; i < newAns.length ; i++) {
//			 System.out.print(newAns[i]) ; 
//		 } 		 
		 pairNode(root , 7 ) ; 
		 
	}
}
