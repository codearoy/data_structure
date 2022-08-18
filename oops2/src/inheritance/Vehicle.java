package inheritance;

public abstract class Vehicle {
 
	private String color ; 
	int maxSpeed ;

	public Vehicle() {
		color = " red " ; 
	}
	
	public Vehicle(int maxSpeed) {
		
		color = " red" ; 
		this.maxSpeed = maxSpeed ; 
	}
	
	
	public void setColor(String s) {
		this.color = s ; 
	}
	
	public String getColor()
	{
	  return this.color ; 	
	}
	
	public void print() {
		System.out.println("vehicle " + " color " +  color + " maxSpeed " +  maxSpeed  );
	}
	
	// abstract method 
	public abstract boolean isMotorized() ; 
	
	public abstract String getCompany(); 
	

}