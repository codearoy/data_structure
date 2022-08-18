package dp;

import java.util.Scanner;

public class MinSquare {

	public static int minSquare(int n) {
		
		if(n == 0 || n==1) {
			return n ; 
		}
		
		
		int minAns = Integer.MAX_VALUE;
		
		for(int i = 0 ; i*i <= n ; i++) {
			int ans = minSquare(n - (i*i)) ; 
		    if(minAns > ans) {
		    	minAns = ans; 
		    }
		}
		
		return 1 + minAns ; 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in) ; 
		int n = s.nextInt() ; 
		int[] dp = new int[n+1] ; 
		
		for(int i = 0 ; i < dp.length ; i++) {
			dp[i] = -1 ; 
		}
		
		System.out.println(minSquare(n)); 
		
	}

}
