package fundamentals;
import java.util.Scanner ;
public class SumOutputPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i <= n) {
			int sum=0;
			int num=1;
			while(num <= i){
				System.out.print(num);
				
				sum = sum + num;
				num++;
				if(num <= i) {
					System.out.print("+");
				}		
			}
			
			System.out.print("=");
			System.out.print(sum);
			
			System.out.println();
			i++;
			
		}
		
	}

}
