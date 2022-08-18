package recursion;

public class MergeSort {
	
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int arr[] = {2, 3, 4, 5, 6, 7, 9 ,4 , 5 };
		
		mergeSort(arr) ; 
		
	}

}
