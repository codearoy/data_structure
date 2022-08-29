package testQuestion;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
    int t;
    int b ;
    long a;
    t=sc.nextInt();
    while(t>0){
       a=sc.nextInt(); 
       b =sc.nextInt();
       long product=1;
       while(a>0){
           product=(product*a)%b;
           a--;
       }
       System.out.println(product);
       t--;
    }
	}
}
