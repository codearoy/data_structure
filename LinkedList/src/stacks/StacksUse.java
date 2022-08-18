package stacks;

public class StacksUse {

	public static <T> void main(String[] args) throws StackFullException, StackEmptyException {
		
//	//	StacksUsingArr stack = new StacksUsingArr() ;
		
		StackUsingLL<Integer> stack = new StackUsingLL<>() ; 
		int arr[] = {5 , 6 , 7 ,1 , 9 } ; 
//		
		for(int i = 0 ; i < arr.length ; i++) {
			stack.push(arr[i]);
		}
		
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
//	//	stack.data[0] = 100 ; 
//		stack.push(10) ; 
//		System.out.println(stack.top());
//		stack.pop() ;
//		stack.size() ; 
//		stack.isEmpty() ; 
//		System.out.println(stack.isEmpty());
//		
		
		
		
		
		
		
	}
	
	
	
}
