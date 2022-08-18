package finalhashmap;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String , Integer> map = new HashMap<>() ; 
		
		
		// insert 
		map.put("abc", 1) ; 
		map.put("def", 2) ; 
		
		// size 
		map.put("abc", 4) ; 
		System.out.println(map.size()) ; 
		
		// presence 
		
		if(map.containsKey("abc")) {
			System.out.println("abc is present");
		}
		
		if(map.containsKey( "abc1")) {
			System.out.println( "abc1 is present");
		}
		
		// get value 
		System.out.println(map.get("def")) ; 
		
		// to avoid first check is available or not 
		int v1 = 0 ; 
		if(map.containsKey("abc2")) {
			v1 = map.get("abc2") ; 
		}

		System.out.println(v1);
		
		map.remove("abc") ; 
		if(map.containsKey("abc")) {
			System.out.println("abc is removed");
		}
		
		// iterate 
		Set<String> keys = map.keySet() ; 
		
		for(String s:keys) {
			System.out.println(s) ; 
		}
		
		// contains value  // O(n)
		map.containsValue("abc") ;  
		
	}

}
