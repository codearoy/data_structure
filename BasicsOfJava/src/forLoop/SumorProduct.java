package forLoop;
import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = s.nextInt();
		
		
		int sum = 0;
		int product = 1;
		
		
		if(c==1) {
			for(int i = 1 ; i <= n ; i++) {
				sum += i ;
			}
			System.out.print(sum);
				
		}
		else {
			
			if(c == 2) {
			for(int i = 1 ; i <= n ; i++) {
				product *= i ;
			}
		}
		else System.out.print("-1");
			
		}
		     
	}

}
