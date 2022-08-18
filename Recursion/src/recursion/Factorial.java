package recursion;

public class Factorial{
	
	public static int fact(int n) {
		if(n==0)
		{
			return 1 ;
		}
		
		int factn = n * fact(n-1) ;
		return factn;
	}
	
	
	public static void main(String[] args) {
		
     System.out.print(fact(5));	
	}

}
