package fundamentals;
import java.util.Scanner;


public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i <= n){
			
		 int space =1;	
		 while(space < i){
			 System.out.print(" ");
			 space++;
			 
		 }
			int star = 2 *(n-i) + 1;
			while(star >= 1 ) {
				System.out.print("*");
				star--;
				
			}
			
			
			
			
			
			
			
			System.out.println();
			i++;
			
		}
	}

}
