package forLoop;
import java.util.Scanner;
import java.util.*;


public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
	//	long n = s.nextInt();
		
		String  str = s.next();
		
	 // boolean b1 = false;
      //boolean p2 = false ;
		for(int i=str.length()-1 ; i >=0 ; i--) {
			
			char ch = str.charAt(i);
			
//			if(ch == '0' && p2==false){
//				continue;
//			}
//			
//			p2 = true;
			
			System.out.print(ch);
			
		}
		
		
		
		

	}

}
