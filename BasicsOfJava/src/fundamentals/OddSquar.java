package fundamentals;
import java.util.Scanner;


public class OddSquar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		while(i <= n){
			
			
			int num =i;
			while(num <= n ) {
				System.out.print(2*num - 1);
				num++;
			}
		 
			int num2=1;
			while(num2 <= i-1) {
				System.out.print(2*num2 - 1);
				num2++;
				
			}
			
			
			
			
			
			
			System.out.println();
			i++;
			
		}
		

	}

}
