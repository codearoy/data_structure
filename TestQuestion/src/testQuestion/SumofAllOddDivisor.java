package testQuestion;

public class SumofAllOddDivisor {

	public static int sumOddDivisor(int a){
		
		int ans = 0 ; 
		int n = 1 ; 
		while(n <= a) {
			if(n % 2 !=0 && a%n == 0)
			ans+= n ; 
			n++ ; 
		}
		
		return ans ; 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5, 7, 6, 4} ; 
		
		int ans = 0 ; 
	
		for(int i = 0 ; i < a.length ; i++) {
			ans += sumOddDivisor(a[i]) ; 
		}
	
		
		System.out.print(ans);
		
	}

}
