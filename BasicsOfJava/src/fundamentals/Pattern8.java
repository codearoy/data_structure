package fundamentals;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		int i =1;
		 while(i <= n) {
			// int p = i;
			 int j=1;
			 char ch = (char)('A' + i - 1);
			 
			 while(j <= n) {
				 System.out.print(ch);
				// p++;
				 ch = (char)(ch + 1);
				 j=j+1;
			 }
			 System.out.println();
			 i++;
		 }
		
		
		
		
	}

}
