package recursion;

public class Recursion {
	
	// factorial n 
	public static int fact(int n) {
		if(n==0)
		{
			return 1 ;
		}
		
		int factn = n * fact(n-1) ;
		return factn;
	}
	
	// sum of n natural number
	public static int sum(int n) {
		if(n==0) {
			return 0 ; 
		}
		
		int smalloutput = sum(n-1);
		int output = n + smalloutput;
		return output; 
		
	}
	
	
	// print 1 to n ; 
	public static void print1ton(int n) {
		if(n==0) {
			return ;
		}
		print1ton(n-1);
		System.out.println(n);
	}
	
	// find nth fibonacci number 
	
	public static int fib(int n){
		if(n==0 || n==1){
			return 1 ;
		}
		int fib1 = fib(n-1);
		int fib2 = fib(n-2);
		return fib1 + fib2 ;
		
	}
	
	// is sorted function recursively 
	public static boolean isSorted(int arr[]) {
		if(arr.length == 1) {
			return true ; 
		}
		
		if(arr[0] > arr[1]){
			return false ;
		}
		
		int[] smallarr =  new int[arr.length -1 ] ;
		for(int i=1 ; i < arr.length ; i++ ) {
			smallarr[i-1] = arr[i] ;
		}
		
		return isSorted(smallarr);
		
		
	}
	
	
	// issorted Better 
	public static boolean isSortedBetter(int[] arr , int si) {
		if(si == arr.length - 1) {
			return true ;
		}
		
		if(arr[si] > arr[si+1]) {
			return false ;
		}
		
		return isSortedBetter(arr , si+1) ;
		
	}
	
	
	
	
	//main function 
	public static void main(String[] args) {
		
//       System.out.println(fact(5));
//       System.out.println(sum(5));
	//	 print1ton(12);
//		System.out.println(fib(5));
         int[] arr = {2,3,4,5,6,7} ;		
		 System.out.print(isSortedBetter(arr,0));
		
	}

}
