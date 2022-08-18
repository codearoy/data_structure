package dynamicArrayPolynomial;

public class DynamicArrUse {
	
	public static void main(String[] args) {
		
		DynamicArr d = new DynamicArr() ;
		
		for(int i = 1 ; i < 100 ; i++) {
			d.add(100 + i );
		}
	
		System.out.println(d.size());
		System.out.println(d.get(98));
		d.set(3 , 170 ) ; 
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("size - " + d.size());
		}		
		
		
		
	}
	
}
