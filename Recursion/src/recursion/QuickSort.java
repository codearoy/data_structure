package recursion;

public class QuickSort {

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
 

	public static void quickSort(int[] input) {
		
	  int si = 0 ; 
     int ei = input.length-1; 
     quickSort1(input , si , ei) ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int arr[] = {2, 3, 4, 5, 6, 7, 9 ,4 , 5 };
		
		quickSort(arr) ; 
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]) ; 
		}
		
	}
}
