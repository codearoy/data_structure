package ObjectsClasses;

public class Students {
    String name ; 
    private int rollnum ; 
    double cgpa ;
    public final static double conversion_factor = 0.95 ;
    public static int numStudents ; 
    
    
    public Students(String s) {
    	name = s; 
    	numStudents++;
    	rollnum = numStudents ;
    	
    }
    
    public Students() {
    	name = "abc"; 
    	rollnum = 0 ; 
    }
    
    // print function 
    
    public void  print() {
    	System.out.println(name + " " + rollnum) ;
    	
    }
    public static int getNumStudents() {
    return numStudents ;	
    	
    	
    }
    
    public int getRollnum(){
    	return rollnum ; 
    }
	
    public void setRollnum(int num){
    	if(num <= 0) {
    		return ; 
    	} 
    	this.rollnum = num ; 
    }
	
    
    
}
