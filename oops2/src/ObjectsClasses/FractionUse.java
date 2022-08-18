package ObjectsClasses;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4 , 6) ;
		f1.print() ;
		Fraction f2 = new Fraction(12,18) ;
//	    f1.setNum(12) ;
//		f1.setDen(13) ;
//		f1.increment() ;
// 		
		
		f1.add(f2) ;
	//	f1.print();
		
		Fraction f3 = Fraction.add(f1,f2) ; 
		f3.print();
		

	}

}
