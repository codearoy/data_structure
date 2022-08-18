package queues;

public class QueueUsingArr {

	private int data[] ;
	private int front ; 
	private int rear ; 
	private int size ;
	
	// O(1)
	public QueueUsingArr() {
		data = new int[4] ; 
		front = -1 ; 
		rear = -1 ; 
		size = 0 ;
		
	}
	
	public QueueUsingArr(int capacity) {
		data = new int[capacity] ; 
		front = -1 ; 
		rear = -1 ;
		size = 0 ; 
		
	}
	
	public int size() {
		return size; 
	}
	
	public boolean isEmpty() {
		return size() == 0 ; 
		
	}
	public void enqueue(int ele){
		if(size== data.length) {
		//	throw new QueueFullException() ; 
		doublecapacity();
		
		
		}
		if(size == 0) {
			data[front+1] = ele ; 
			front++ ;
			rear++;
			size++;
		}else {
			data[rear + 1 ] = ele ; 
			rear++;
			size++;
		}
		
	}
	
	// O(N)
	private void doublecapacity() {
		// TODO Auto-generated method stub
		int temp[] = data ;
		data = new int[2 * temp.length];
		int index = 0; 
		for(int i= front ; i < temp.length ; i++) {
			data[index++] = temp[i];
		}
		for(int i=0 ; i < front ; i++) {
			data[index++] = temp[i];
		}
		front = 0 ; 
		rear = temp.length - 1 ; 
	}

	public int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front] ;
		
	}
	
	public int dequeue() throws QueueEmptyException {
		if(size == 0 ) {
			throw new  QueueEmptyException();
		}
		int temp = data[front] ;
		front ++ ;
		if(front== data.length) {
			front = 0 ;
		}
		size--;
		if(size==0) {
			front = -1 ; 
			rear = -1 ; 
		}
		return temp ;
	}
	
}
