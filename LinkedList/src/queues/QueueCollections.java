package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {

	public static void main(String[] args) {
		// Queue is an interface it can only be instanciated using an 
		//implemented class which implements the interface that is it can 
		//point to object of implement class 
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(12) ;
		q.add(23) ; 
		//q.size() ; 
		System.out.print(q.size());
		
	}
}
