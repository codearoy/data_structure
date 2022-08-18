package arraySort;

public class BubbleSort {
	
	
	public static void sorting(int[] arr) {
		int n = arr.length; 
		
		for(int i = 0 ; i < n  ; i++){
			
			
			// swaping each and every element after comparision 
			// at every iteration max number will go to right most array 
			 
            int temp = 0  ; 
            for(int j = 0 ; j < n-1-i ; j++){
            	if(arr[j+1] > arr[j]) {
                temp = arr[j] ;
                arr[j] = arr[j+1] ;
                arr[j+1] = temp ; 
            	}
            }
           // System.out.println(arr[n-1-i]);
        }
        
		
	}
	
	public static void printArray(int[] arr) {

		int n = arr.length ;
		
		for(int k= 0 ; k < n ; k++) {
			System.out.print(arr[k]);
		}
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 3, 4, 7, 1, 6} ; 
	    sorting(arr);
		printArray(arr) ; 
		
		
	}

}
