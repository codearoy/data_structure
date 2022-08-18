package finalhashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	

	private static ArrayList<Integer> removeDuplicates(int[] arr) {
		
		HashMap<Integer,Boolean> map = new  HashMap<>() ; 
		ArrayList<Integer> out = new ArrayList<>() ; 
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(map.containsKey(arr[i])) {
				continue ; 
			}
			out.add(arr[i]) ; 
			map.put(arr[i], true) ; 
		}
		return out;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 1, 3, 2, 2 , 3,1,6,2,5 } ;	
		ArrayList<Integer> out = removeDuplicates(arr) ; 
		System.out.print(out);

	}

}
