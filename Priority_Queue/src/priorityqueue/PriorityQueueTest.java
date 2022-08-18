package priorityqueue;

public class PriorityQueueTest {
	
	public static void main(String[] args) throws PriorityQueueException {

	Priority_Queue<String> pq = new Priority_Queue<String>() ;
	pq.insert("abc" , 15) ; 
	pq.insert("def", 13);
	pq.insert("ghi", 90);
	 
	while(!pq.isEmpty()) {
		System.out.println(pq.getMin()) ;
		pq.removeMin();
		
	}
	
	}
}

