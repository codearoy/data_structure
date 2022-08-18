package recursion;

public class SumOfArray {
	
	public static int sumOfArray(int arr[] , int n) {
		if(n == 0 ) {
			return arr[0] ; 
		}
		
		return arr[n] + sumOfArray(arr , n-1) ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 1 ,1 ,1,1,1,1}; 
		int n = arr.length ; 
 		
			int sum = sumOfArray(arr , n-1) ; 
			System.out.print(sum);
		
	}

}
