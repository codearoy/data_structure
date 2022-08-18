package generics;

public class PairUse {

	public static void main(String[] args) {
		Pair<Integer> p = new Pair<>(10,15); 
		p.getFirst();
        System.out.print(p.getFirst());
        
        Pair<Character> pC = new Pair<>('a' , 'b'); 
        Pair<String> pS = new Pair<>("aa " , " bb"); 
        Pair<Double> pD = new Pair<>(10.0,15.0); 
       
        
	}

}
