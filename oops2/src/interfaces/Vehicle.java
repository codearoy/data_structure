package interfaces;

public class Vehicle implements VehicleInterface{

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	public void print() {
		System.out.print("it is a vehicle class ");
	}
	
	
}
