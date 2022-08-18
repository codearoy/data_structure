package dynamicArrayPolynomial;

public class Polynomial {

	private int data[] ;
    private int nextEI = 0 ;
    
    public Polynomial(){
        data = new int[5];
        nextEI = 0 ; 
    }
    
    private int size() {
		return nextEI ;
	}
    
    private int get(int i) {
		return data[i] ; 
	}
    
    private void doubleCapacity() {
		int temp[] = data ; 
		data = new int[2 * temp.length];
		for(int i = 0 ; i < temp.length ; i++ ) {
			data[i] = temp[i] ; 
		}
	}
    
	public void setCoefficient(int degree, int coeff){
        if(degree >= data.length){
            doubleCapacity() ; 
        }
        if(degree > nextEI){
            int temp = nextEI ; 
            while(temp < degree){
                data[temp] = 0 ;   ;
                temp++; 
                nextEI++;
            }
        }
         data[degree] = coeff ;
         nextEI++;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		int i = 0 ;
        while (i < nextEI){
            if(data[i] > 0){
            	System.out.print(data[i] + "x" + i + " ") ;     
           }
            i++ ; 
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
	   Polynomial result = new Polynomial() ; 
	   
        int i = 0 ; 
        while(i < this.size() && i < p.size()){
		  result.setCoefficient(i , this.get(i)+p.get(i));
          i++;
        }
        
        if(i==this.size()){
             while(i < p.size()){
                 result.setCoefficient(i , p.get(i));
                 i++;
             }
        }
        
        if(i == p.size()){
            while(i < this.size()){
                result.setCoefficient(i , this.get(i)); 
                i++;
            }
        }
        return result ; 
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
    	 Polynomial result = new Polynomial() ;
         
         int min = 0 , max = 0 ; 
         
         if(this.size() >= p.size()){
            max = this.size() ; 
            min = p.size() ; 
        }else {
            min = this.size() ; 
            max = p.size() ; 
        }
         
         
        if(min == p.size()){
            int i = 0 ; 
            while(i < p.size()){
                 result.setCoefficient(i , this.get(i)-p.get(i)); 
                 i++;
             }
            
            while(i < this.size()){
                result.setCoefficient(i , this.get(i));
                i++; 
            }
        }
         
       if(min == this.size()){
            int i = 0 ; 
            while(i < this.size()){
                 result.setCoefficient(i , this.get(i)-p.get(i)); 
                 i++;
             }
            
            while(i < p.size()){
                result.setCoefficient(i , -p.get(i));
                i++; 
            }
        }
         return result ; 
            
           
    }
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		  Polynomial result = new Polynomial() ;
          return  p ; 
	}
	
	
}
