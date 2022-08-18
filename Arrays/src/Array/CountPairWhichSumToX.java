package Array;

import java.util.HashMap;

public class CountPairWhichSumToX {

	public static void main(String[] args) {
		int[] arr = {1,3,6,8,9,7,4}; 
		System.out.println(countPairSumTriplet(arr))  ; 

	}

	private static int countPairSumTriplet(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer , Integer>() ; 
		int count = 0 ; 
		
		for(int i = 0 ; i < arr.length ; i++) {
			map.put(arr[i], arr[i]) ; 
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			int sum = arr[i] ; 
			for(int j = 0 ; j < arr.length ; j++) {
				int key = sum - arr[j] ; 
				if(map.containsKey(key)) {
					count++ ; 
				}
			}
		}
		return count;
	}

}
