package queues;

import java.util.Stack;

public class QueueUsingStacks<T> {

	Stack<T> s1 ;
	Stack<T> s2 ; 
	
	public QueueUsingStacks() {
		s1 = new Stack<>() ; 
		s2 = new Stack<>() ; 
		
	}
	
	public int size() {
		return s1.size();
	}
	
	public boolean isEmpty(){
		return s1.isEmpty() ; 
	}
	
	public void enqueue(T ele){
		s1.push(ele) ; 
		
	}

	public T front(){
		while(s1.size() == 1) {
			s2.push(s1.peek());
			s1.pop(); 
		}
		T temp = s1.peek();
		while(!s2.isEmpty()) {
			s1.push(s2.peek()) ; 
			s2.pop();
		}
		return temp; 
 	}
	
	public T dequeue(){
		while(s1.size() == 1) {
			s2.push(s1.peek());
			s1.pop(); 
		}
		T temp = s1.peek();
		s1.pop(); 
		while(!s2.isEmpty()) {
			s1.push(s2.peek()) ; 
			s2.pop();
		}
		return temp;
		
	}
	
}
