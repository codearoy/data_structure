package priorityqueue;

import java.util.ArrayList;

public class Priority_Queue<T> {
	
	ArrayList<Element<T>> heap ; 
	
	public Priority_Queue() {
		heap = new ArrayList<>() ; 
	}
	
	public void insert(T value , int priority) {
		
		Element<T> e = new Element<>(value , priority) ; 
		heap.add(e) ; 
		int childIndex = heap.size() -1 ; 
		int parentIndex = (childIndex -1) / 2 ; 
		
		while(childIndex > 0 ) {
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
		
		   Element<T> temp = heap.get(childIndex) ; 
		   heap.set(childIndex, heap.get(parentIndex)) ; 
		   heap.set(parentIndex, temp) ; 
		   childIndex = parentIndex ; 
		   parentIndex = (childIndex -1 )/2  ; 
		  
			}else {
				return ; 
			}
		
		}
		
	}
	
	public T getMin() throws PriorityQueueException {
		if(isEmpty()){
			throw new PriorityQueueException() ; 
		}
		
		return heap.get(0).value ; 
	}
	
	public T removeMin() throws PriorityQueueException {
		if(isEmpty()){
			throw new PriorityQueueException() ; 
		}
		
	    Element<T> temp = heap.get(0) ; 
	     T ans = temp.value; 
	    
	    heap.set(0, heap.get(heap.size()-1)) ; 
	    heap.remove(heap.size()-1) ; 
	    
	    int pi = 0 ; 
	    int lci = 2 * pi + 1 ; 
	    int rci = 2 * pi + 2  ; 
	    
	   
	    while(lci < heap.size()) {
	    	
		    int minIndex = pi ; 
		    
		    if(heap.get(lci).priority  < heap.get(minIndex).priority) {
		    	minIndex = lci ; 
		    }
		    
		    if(rci < heap.size() &&  heap.get(rci).priority  < heap.get(minIndex).priority) {
		    	minIndex = rci ; 
		    }
		    
		    if(minIndex == pi) {
		    	break ; 
		    }
		    
		    Element<T> temp1 = heap.get(minIndex) ; 
		    heap.set(minIndex, heap.get(pi)) ; 
		    heap.set(pi, temp1) ; 
		    
		    pi = minIndex ; 
		    lci = 2 * pi + 1 ; 
		    rci = 2 * pi + 2  ; 
	    }
	    
	    return ans; 
	    
	}
	
	public int size() {
		return heap.size() ; 
	}
	
	public boolean isEmpty() {
	   if(size() == 0) {
		   return true; 
	   }
	   return false ;
	}

}
