package Array;

public class SearchOfTargetElement {
	
	// method 1 . linear search iteratively 
	// time = O(n) 
	
	private static boolean isPresent(int[] arr , int target) {
		
		for(int i= 0 ; i < arr.length ; i++) {
			if(arr[i]== target) {
				return true ; 
			}
		}
		
		return false;
	}

	
	public static void main(String[] args) {
		int[] arr = {3, 4, 5 ,7 ,8 ,9 } ; 
		boolean ans = isPresent(arr , 8) ; 

		System.out.println(ans) ; 
		
	}

	
}
