package recursion;

public class CheckNumInArray {

	private static  boolean checkNum(int[] arr, int x , int n) {
		// TODO Auto-generated method stub
		
		if(n == -1) {
			return false ; 
		}
		
		if(arr[n] == x) {
			return true ; 
		}else return checkNum(arr , x , n-1) ; 
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 3, 4, 5, 6, 7, 9};
		int x = 11;
		int n = arr.length ; 
		
		System.out.print(checkNum(arr , x , n-1)) ;  
		
	}

	
}
