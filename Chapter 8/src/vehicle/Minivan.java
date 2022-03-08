package vehicle;

public class Minivan extends Vehicle{
	
		
	public Minivan(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
		
	@Override
	String cargoContainer() 
	{
		String cargoString = ("Cargo container type: Bed, with a capacity of: " + super.getCargoVolume() + "L.");
		return (cargoString);
	}
	
	@Override
	String description() 
	{
		String carDesc = (" Vans are typically used for hauling around people and their stuff. \nWith up to 8 seats, and a roomy interior, they're great for families with many or even few children.");
		return carDesc;
	}
	
	public String toString()
	{
		String vanString;
		
		vanString = "Fuel Economy: " + super.getFECity() + " City, " + super.getFEHwy() + " Highway. \n";
		vanString += "Seating: " + super.getSeating() + "\n";
		vanString += cargoContainer();
		vanString += description();
		
		return vanString;
	}

}
