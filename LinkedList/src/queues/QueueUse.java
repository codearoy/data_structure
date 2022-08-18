package queues;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException, QueueFullException {
		// TODO Auto-generated method stub
		QueueUsingStacks q = new QueueUsingStacks();
		
//		
		
		int arr[] = {4 ,5 , 6, 7} ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			q.enqueue(arr[i]) ; 
		}
		
		q.enqueue(30) ; 
		q.dequeue() ; 
		System.out.print(q.dequeue());
		
//		while(! q.isEmpty()) {
//			System.out.println(q.dequeue()); 
//		}
//		
	}

}
