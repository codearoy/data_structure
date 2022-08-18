package arraySort;

public class MergeSort {
	
	public static void conquer(int[] arr , int si , int mid , int ei) {
		int merged[] = new int[ei -si + 1];
		int i=si;
		int j = mid+1 ;
		int k = 0;
		
		while (i <= mid && j <= ei) {
			if(arr[i] <= arr[j]) {
				merged[k++] = arr[i++];
			}else {
				merged[k++] = arr[j++] ; 
				
			}
			
			
		}
		
		
		while (i <= mid && j <= ei) {
			if(arr[i] <= arr[j]) {
				merged[k++] = arr[i++];
			}else {
				merged[k++] = arr[j++] ; 
				
			}
			
			
		}
		
		while (i <= mid && j <= ei) {
			if(arr[i] <= arr[j]) {
				merged[k++] = arr[i++];
			}else {
				merged[k++] = arr[j++] ; 
				
			}
			
			
		}
		
		for(int l = 0, m = si ; l < merged.length ; l++ , m++){
			arr[m] = merged[l] ;
		}
		
		
		
	}
	
	
	
	
	public static void divide(int arr[] , int si , int ei) {
		if(si >= ei) {
			return ; 
		}
		int mid = si + (ei - si )/2 ;
		divide(arr , si , mid);
		divide(arr, mid+1 , ei );
		conquer(arr,si,mid, ei) ;
		
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,1,9,3,6,8} ; 
		int n = arr.length ; 
		divide(arr , 0 , n-1) ;
		
		for(int i = 0 ; i < n ; i++){
			System.out.print(arr[i] + " ");
		}
		

	}

}
