package interfaces;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle() ; 
		
		// we can create reference of interface only 
		VehicleInterface vi  ; 
		vi = new Vehicle() ; 
		
		vi.getCompany() ; 
		
		// we cant access other method other than interface ; 
		
		

	}

}
