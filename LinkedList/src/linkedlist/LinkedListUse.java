package linkedlist;
import java.util.*;
public class LinkedListUse {
	
	// rverse list iteratively 
	public static Node<Integer> ReverseList(Node<Integer> head){
 
		Node<Integer> prev = null ; 
		Node<Integer> curr = head; 
		
		while(curr != null){
		 Node<Integer> temp = curr.next; 
		 curr.next = prev ; 
		 prev = curr; 
		 curr = temp ;  
		}
		
		return prev; 
	}	
	
	// reverse list recursively 
	public static Node<Integer> ReverseListRec(Node<Integer> head){
	
	  if(head ==null || head.next == null) {
    	   return head ;
       }
       
       Node<Integer> r = ReverseList(head.next);
       head.next.next = head ;
       head.next = null ; 
       
       return r ;
    }
    
    // take input 
	public static Node<Integer> takeInput() 
	{
		Scanner s = new Scanner(System.in);
		int data = s.nextInt() ;
		Node<Integer> head = null , tail = null ; 
		
		
		while(data != -1)
		{
			Node<Integer> currentNode = new Node<Integer>(data) ; 
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

	// print 
	public static void print(Node<Integer> head)
	{
		System.out.println("print" + head);
		
		Node<Integer> temp = head ;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next; 
		}
		System.out.println() ; 
	}
	
	//increment each node 
    public static void increment(Node<Integer> head)
	{
		 Node<Integer> temp = head;
		 while(temp != null)
		 {
			 temp.data++ ;
			 temp = temp.next ;
		 }
	}
	
	// create linked list
	public static Node<Integer> createLinkedList()
	{
	Node<Integer> n1 = new Node<>(10) ; 
	Node<Integer> n2 = new Node<>(20) ; 
	Node<Integer> n3 = new Node<>(30) ; 
	Node<Integer> n4 = new Node<>(40) ; 
	n1.next = n2 ;
	n2.next = n3 ;
	n3.next = n4 ;
	return n1 ; 
		
	}
	
	// insert node in list recursively  
	public static Node<Integer> insert(Node<Integer> head , Node<Integer> data1 , int pos)
	{
		if(pos==0)
		{
			data1.next = head ;
			return data1;
		}
		if(head == null && pos > 0){
			return head ;
		}
		
		head.next = insert(head.next , data1 , pos-1) ; 
		
		return head ;
	}

	public static void main(String [] args)
	{
	
		Node<Integer> head = takeInput();
		Node<Integer> data1 = takeInput() ;
		
		print(insert(head , data1 , 8));
		print(ReverseList(head)) ;
//	    increment(head) ; 		
//		System.out.println(n1) ;
//		System.out.println(n1.data) ; 
//      System.out.println(n1.next) ; 
	}
}
	
 