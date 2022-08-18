package inheritance;

public abstract class Car extends Vehicle {
	
	int numDoors ;
    
	// complete the abstract method of inherited method or you can declare subclass as an abstract
	
	
	
	
	public void printCar() {
		System.out.println("Car " + " color " + getColor() + " maxSpeed " +  maxSpeed  );
	}

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return true ;
	}

//	@Override
//	public String getCompany() {
//		// TODO Auto-generated method stub
//		return null;
//	}


}
