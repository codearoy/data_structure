package recursion3;

import java.util.Scanner;

public class Factorial {
	
   // factorial without returning
	private static void factorial(int n, int answer) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.print(answer);
			return ; 
		}
		
		answer *= n ; 
		factorial(n-1 , answer) ; 
		
	}

	// printMin without using returning 
    public static void printMin(int a[] , int si , int minSoFar) {
    	
    	if(si == a.length ) {
    		System.out.print(minSoFar);
    		return ; 
    	}
    	
    	int newMin =  minSoFar ; 
    	if(a[si]  < minSoFar) {
    		newMin = a[si] ; 
    	}
    	
    	printMin(a , si+1 , newMin) ; 
    	
    }
	
	public static void printSubsequences(String s , String stringSoFar) {
		
		if(s.length()== 0) {
			System.out.print(stringSoFar);
			return ;
		}
		
		String smallOut = s.substring(1) ; 
		printSubsequences(smallOut , stringSoFar) ; 
		printSubsequences(smallOut , stringSoFar + s.charAt(0));
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in) ; 
     String s1 = s.next() ; 
      
       printSubsequences(s1 , "") ; 
//     int n = s.nextInt() ; 
//     int a[] = {3 , 4 , 5 , -1 , 8 } ; 
//     printMin(a , 0 , Integer.MAX_VALUE ) ; 
//     
//     factorial(n , 1) ;
//	
     }

}
