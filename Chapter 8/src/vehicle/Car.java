package vehicle;

public class Car extends Vehicle
{

	/*
	 * Create a Car object
	 */
	public Car(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	

	@Override
	String cargoContainer() 
	{
		String cargoString = ("Cargo container type: Trunk, with a capacity of: " + super.getCargoVolume() + "L.");
		return (cargoString);
	}

	@Override
	String description() 
	{
		String carDesc = (" Cars are typically used for point-point driving and daily use, as they are small, fuel efficient and depending on the brand, reliable.");
		return carDesc;
	}
	
	public String toString()
	{
		String carString;
		
		carString = "Fuel Economy: " + super.getFECity() + " City, " + super.getFEHwy() + " Highway. \n";
		carString += "Seating: " + super.getSeating() + "\n";
		carString += cargoContainer();
		carString += description();
		
		return carString;
	}

}
