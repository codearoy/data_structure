package Array;


public class spanOfStock {
	
	public static int[] span(int[] price) {
		// TODO Auto-generated method stub
		int res[] = new int[price.length] ; 
		
		int i = 0 ; 
		int max = 0 ; 
		int count = 1 ; 
		while(i < price.length) {
			if(price[i] >= max) {
				res[i] = count ; 
				count++ ; 
				max = price[i] ; 
			}else {
				res[i] = 1; 
				max = price[i] ; 
				count = 1 ; 
			}
			i++ ; 
		}
		
		
		return res ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] price = {20, 30 , 40 ,15 , 70, 40} ; 
		
		int[] res = span(price) ;
		int i = 0 ; 
		while(i < res.length) 
		{
			System.out.println(res[i]);
			i++ ; 
		}
	}


}
