package loops;
import java.util.*;
import java.util.Scanner;

public class SumEvenOdd{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n  = s.nextInt() ;
		int sum_odd = 0 ; 
		int sum_even = 0 ; 
		
		
		
		while(n > 0) {
			int digit = n % 10 ; 
			if(digit % 2 == 0) {
				sum_even+=digit ; 
			}else {
				sum_odd+=digit ; 
			}
			
			n = n/10 ; 
		}
		
		System.out.println("sum of Even digit ="+ sum_even) ; 
		System.out.println("sum of odd digit ="+ sum_odd) ; 
		
	}

}
