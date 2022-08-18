package fundamentals;
import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i <= n+1){
			System.out.print("*");
			
			int num=1;
			while(num < i){
				System.out.print(num);
				num++;
			}
			
			int num2 = i-1;
			while(num2 > 1 ) {
				System.out.print(num2-1);
				num2--;
			}
			
			
			if(i > 1) {
				System.out.print("*");
			}
			
			System.out.println();
			i++;
			
		}
		
		int i1 = n;
		while(i1 >= 1){
			System.out.print("*");
			
			int num=1;
			while(num < i1){
				System.out.print(num);
				num++;
			}
			
			int num2 = i1-1;
			while(num2 > 1 ) {
				System.out.print(num2-1);
				num2--;
			}
			
			
			if(i1 > 1) {
				System.out.print("*");
			}
			
			System.out.println();
			i1--;
			
		}
		
		
		
		
	}

}
