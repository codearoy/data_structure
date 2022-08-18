package Array;
import java.util.*;

public class trapRainWater {
	
	public static int trapUsingLeftAndRight(int[] arr) {
		int arrL[] = new int[arr.length] ; 
		int arrR[] = new int[arr.length] ; 
		int water = 0 ;
		
		int temp = -1 ; 
		int i = 0 ; 
		while(i < arr.length ) {
			temp = Math.max(arr[i], temp);
			arrL[i] = temp ; 
			i++;
		}
		
		int temp2 = -1 ; 
		int j = arr.length -1  ; 
		while(j >= 0  ) {
			temp2 = Math.max(arr[j] , temp2) ;
			arrR[j] = temp2 ; 
			j--;
		}
		int k = 0 ; 
	  while(k < arr.length -1 ) {	 
		 water = water + Math.min(arrL[k], arrR[k])-arr[k] ;   
		k++ ;  
	 }
		
	return water ;	
	}
	
	
	public static int trapUsingStack(int[] arr) {
		
		Stack<Integer> s = new Stack<>() ; 
		
		
		
		
		
		
		return 0 ; 
	}

	public static int trap(int[] arr) {
		int left = arr[0] ; 
		int right = 0 ; 
		int leftIndex = 0 ; 
		int water = 0; 
		int temp = 0 ; 
		
	
		for(int i= 1 ; i < arr.length ; i++) {
			
			if(arr[i] > left) {
			leftIndex = i;
			left = arr[i] ; 
			temp = 0 ; 
			}
			else {
				water = water + left - arr[i] ; 
			    temp = temp + left -arr[i] ; 
			}
		}
		
		if(leftIndex < arr.length - 1) {
			water = water - temp; 
			left = arr[arr.length -1 ] ; 
			
			for(int i = arr.length - 1 ; i >= leftIndex ; i--) {
				if (arr[i] >= left) {
                    left = arr[i];
                }
                else {
                    water += left - arr[i];
                }
				
				
			}
			
			
		}
		return water ; 
		
		
	}
	
	
	
	public static void main(String[] args)
	{
	    int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
	    //int n = arr.length;
	    System.out.println(trap(arr));
	   System.out.println(trapUsingLeftAndRight(arr));
	}
}

