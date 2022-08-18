package stacks;

public class StacksUsingArr {
	private int[] data ; 
	private int topIndex ; 
	
	public StacksUsingArr() {
		 data = new int[10]  ; 
		 topIndex = -1 ; 
	}
	
	public StacksUsingArr(int size) {
		 data = new int[size]  ; 
		 topIndex = -1 ; 
	}
	
	private void doubleCapacity() {
		int temp[] = data ;
		data = new int[ 2 * temp.length] ; 
		for(int i = 0 ; i < temp.length ; i++) {
		   data[i] = temp[i] ; 
		}
		
	}
	// O(1)
	public int size(){
		return topIndex + 1 ; 
	}
	
	// O(1)
	public int top() throws StackEmptyException{
		if(topIndex == -1) {
			// throw stackEmptyException
			throw new StackEmptyException();
		}
		return data[topIndex] ; 
	}
	
	
	// O(1)
	public void push(int elem) throws StackFullException {
		// if stack is full 
     	if(topIndex == data.length-1) {
//			// Throw Exception 
//			StackFullException e = new StackFullException();
//			throw e ;
//			// throw new StackFullException() ;
         doubleCapacity() ;
     	}
		data[++topIndex] = elem ;
	}
	
	public int pop() throws StackEmptyException{
		if(topIndex == -1) {
			// throw stackEmptyException
			throw new StackEmptyException();
		}
		int temp = data[topIndex] ; 
		topIndex--; 
		return temp ; 
		
	}
	
	public boolean isEmpty() {
		return topIndex == -1 ; 
		
	}
	

}
