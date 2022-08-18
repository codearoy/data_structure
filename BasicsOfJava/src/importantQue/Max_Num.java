package importantQue;
import java.util.*; 


public class Max_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int n = s.nextInt() ;
		
		int maxnum = 0 ;
		int i = 1;
		while(n/i > 0)
		{
			int newnum = (n /(i * 10)) *  i + n % i ;
			i = i * 10 ;
			if(maxnum< newnum)
			{
				maxnum = newnum ;
				
			}
		}
		
		System.out.print(maxnum);
		

	}

}
