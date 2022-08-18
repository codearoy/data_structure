package stacks;

import java.util.Stack;

public class StackCollections {
	public static void main(String[] args) {
	Stack<Integer> st = new Stack<>() ;

	int arr[] = {5, 6 ,7 ,9 ,10} ; 	
    
	for(int elem : arr) {
		st.push(elem);	
	}
	
	st.push(10); 
	System.out.println(st.size()) ; 
	System.out.println(st.peek()) ; 
	System.out.println(st.pop()) ; 
	System.out.println(st.isEmpty()) ; 
	
	}	
	
	
}
