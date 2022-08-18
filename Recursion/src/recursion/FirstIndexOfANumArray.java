package recursion;

public class FirstIndexOfANumArray {
	
	
	public static int firstIndex(int[] arr, int n , int x) {
		if(n == arr.length) {
			return -1 ; 
		}
		
		if(arr[n] == x) {
			return n ; 
		}else return firstIndex(arr , n+ 1 , x); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 3, 4, 5, 6, 7, 9 ,4 , 5 };
		int n = arr.length ; 
		int x = 4; 
		System.out.print(firstIndex(arr , 0 , x )) ;  
      
		
	}

}
