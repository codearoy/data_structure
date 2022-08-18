package forLoop;
import java.util.Scanner;

public class TermsOfAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();		
		
		for(int i =1 ; i <= x ; i++) {
			int term = 3 * i + 2;
			if(term % 4 == 0) {
				x++;
				continue;
			}
			
			System.out.print(term + " " );
			
			
			
		}
		
		
		
		
		
		

	}

}
