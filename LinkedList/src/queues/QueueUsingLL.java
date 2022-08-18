package queues;

import linkedlist.Node;

public class QueueUsingLL<T> {
	
	// all the method are of o(1) of time complexity 
	
	private Node<T> front ; 
	private Node<T> rear ; 

	private int size ;
	
	public QueueUsingLL() {
		front = null; 
		rear = null  ; 
		size = 0 ; 
	}
	public int size() {
		return size ;
	}
	
	public boolean isEmpty(){
		return size() == 0 ; 
	}
	
	public void enqueue(T ele){
		Node<T> elm = new Node<>(ele);
		rear.next = elm ;
		rear = rear.next ; 
		size++; 
	}
	
	
	public T front(){
		return front.data ; 
	}
	
	public T dequeue(){
		T temp = front.data ; 
		front = front.next ; 
		size--; 
		return temp; 
	}
	
}
