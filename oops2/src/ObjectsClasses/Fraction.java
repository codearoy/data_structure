package ObjectsClasses;

public class Fraction {
	private int num ; 
	private int den ;
	
	public Fraction(int num , int den) {
		this.num = num ;
		this.den = den;
		simplify();
	}
	
	private void simplify() {
		int gcd = 1 ; 
		int smaller = Math.min(num,den) ;
		for(int i =2 ; i <= smaller ; i++ ){
			if(num % i ==0 && den % i == 0 ) {
				gcd = i ;
			}
		}
		num = num /gcd ;
		den = den /gcd ;
		
	}
	
	public void add(Fraction f2) {
		this.num = this.num * f2.den + this.den + f2.num ;
		this.den = this.den * f2.den ;
		simplify();
		
	}
	
	public static Fraction add(Fraction f1 , Fraction f2) {
		int newnum = f1.num * f2.den + f2.num  * f1.den ; 
		int newden = f1.den * f2.den ; 
		Fraction f3 = new Fraction(newnum , newden) ;
		return f3 ;
	}
	
	

	public void print() {
		System.out.println(num + "/" + den);
		
	}
	
	
	
	

}
