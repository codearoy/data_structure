package linkedlist;

import java.util.Scanner;

public class LinkedListUse2 {
	
	// merge
	 public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	        //Your code goes here
	        LinkedListNode<Integer> t1 = head1 , t2 = head2 , head =  null , tail = null ;  
	        
	        if(head1 == null){
	            return head2 ;
	        }
	        if(head2 == null){
	            return head1;
	        }
	        
	        if(t1.data <= t2.data)
	        {
	            head = t1 ; 
	            tail = t1 ;
	            t1 = t1.next ;
	        }
	        else 
	        {
	            head = t2 ; 
	            tail = t2 ;
	            t2 = t2.next ;
	        }
	        
	        while(t1 != null && t2 != null)
	        {
	            if(t1.data <= t2.data)
	            {
	                tail.next = t1 ;
	                tail = t1 ;
	                t1 = t1.next ;
	            }
	            else 
	        {
	            tail.next = t2 ; 
	            tail = t2 ; 
	            t2 = t2 .next ;
	        }
	              
	        }
	        
	        if(t1 == null){
	            tail.next = t2 ;
	        }else 
	            tail.next = t1 ;
	        
	        
	    return head ;
	    }


	// midpoint
	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null){
            return head ;
        }
        else {
            LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next ; 
            slow = slow.next ;
        }
        return slow ;
        }
        
    }
	
	//mergesort
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
		if(head == null || head.next == null) {
			return head ;
		}
	    
	  LinkedListNode<Integer> slow 	= midPoint(head) ;
	  LinkedListNode<Integer>head1 = head ;
	  LinkedListNode<Integer>head2 = slow.next ;
	  slow.next = null ; 
		
	   
	   LinkedListNode<Integer> h1 = mergeSort(head1);
	   LinkedListNode<Integer> h2 = mergeSort(head2);
	   
	   return mergeTwoSortedLinkedLists(h1,h2);
		
	}

	
	// print 
    public static void print(LinkedListNode<Integer> head)
		{
			System.out.println("print" + head);
			
			LinkedListNode<Integer> temp = head ;
			while(temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next; 
			}
			System.out.println() ; 
		}
		
	
	public static LinkedListNode<Integer> takeInput() 
	{
		Scanner s = new Scanner(System.in);
		int data = s.nextInt() ;
		LinkedListNode<Integer> head = null , tail = null ; 
		
		
		while(data != -1)
		{
			LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(data) ; 
			if(head == null)
			{
				head = currentNode ;
				tail  = currentNode ;				
			}
			else 
			{
				tail.next = currentNode ;
				tail = tail.next ; 
			}
			data = s.nextInt();
		}
		return head ; 
	}

	
	public static void main(String [] args)
	{
	
		LinkedListNode<Integer> head = takeInput();
		mergeSort(head);
		print(head);
//		LinkedListNode<Integer> data1 = takeInput() ;
		
	
//	    increment(head) ; 		
//		System.out.println(n1) ;
//		System.out.println(n1.data) ; 
//      System.out.println(n1.next) ; 
	}
}
