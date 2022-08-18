package Array;

public class Searching {
     
// Binarry search using recursion for sorted arrray
// time = O(log n ) 
	
 	public static int BinarySearch(int[] arr ,int x , int  si , int ei) {
		if(si > ei) {
			return -1  ;
		}
		
		int mid = si + (ei - si) / 2 ;
		if(arr[mid] == x ) {
			return mid ;
		}else 
		if(arr[mid] > x) {
			ei = mid - 1 ;
			
		}else {
			si = mid + 1 ; 
		}
		
		return BinarySearch(arr , x , si , ei) ; 
		
	}
 	
 	
// Merge sort algorithm

	    public static void merge(int[] s1 , int[] s2 , int[] d ){
	        int i = 0 ; 
	        int j = 0 ; 
	        int k = 0 ;
	        
	        while(i < s1.length  && j < s2.length)
	        {
	            if(s1[i] < s2[j]){
	                d[k] =  s1[i] ;
	                i++ ;
	                k++;
	            } 
	            else {
	                d[k] = s2[j] ;
	                j++;
	                k++;
	            }
	             
	        }
	        while(i < s1.length){
	            d[k] =  s1[i] ;
	                i++ ;
	                k++;
	        }
	         while(j < s2.length){
	            d[k] =  s2[j] ;
	                j++ ;
	                k++;
	        }
	        
	    }
	    
		public static void mergeSort(int[] a){
			// Write your code here
	        if(a.length <= 1){
	            return ;
	        }
	        
	        int[] b = new int[a.length / 2] ;
	        int[] c = new int[a.length-b.length] ; 
	        
	        for(int i = 0 ; i < b.length; i++){
	            b[i] = a[i] ;
	        }

	         for(int i = b.length  ; i < a.length; i++){
	            c[i-b.length] = a[i] ;
	        }
	        
	        mergeSort(b) ;
	        mergeSort(c) ;
	        merge(b , c , a) ;
	        
			
		}
	

	
//quick sort alogorithm
		
	 public static int partition(int[] a , int si , int ei){
	        int count = 0 ; 
	        int element = a[si] ; 
	        for(int i = si+1 ; i <= ei ; i++){
	            if(a[i] < element){
	                count++;
	            }
	        }
	        
	        int p = si + count ; 
	        int temp1 = a[p] ;
	        a[p] = element ; 
	        a[si] = temp1 ;
	        
	        int i = si ; 
	        int j = ei ; 
	        while(i < j)
	        {
	            if(a[i] < element){
	                i++;
	            }else
	            if(a[j] >= element) {
	                j--;
	            }else {
	            	int temp2 = a[i] ; 
	                a[i] = a[j] ;
	                a[j]= temp2;
	                i++;
	                j--;
	                
	            }
	            
	        }
	        
	        return p;
	        
	    }
	    
	 public static void quickSort1(int[] a , int si , int ei){
	        if(si >= ei){
	            return ;
	        }
	        
	        int i = partition(a , si , ei) ; 
	        quickSort1(a , si , i-1);
	        quickSort1(a , i+1 , ei);
	        
	    }
	
	
	
	
// main code  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={5,2,3,4,1,6,7}; 
		//System.out.print(BinarySearch(arr , 5 , 0 , 6));
		quickSort1(arr,0,6);
		for(int i = 0 ; i < arr.length ; i++) {
		System.out.print(arr[i]);
		}
	}
}

