package vehicle;

public class Truck extends Vehicle{

	
	public Truck(int fECity, int fEHwy, int seating, double cargo) 
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
		String carDesc = (" Trucks are typically used for towing or carrying large loads. \nHowever, they are also very comfortable, making them good vehicles for long distance driving.");
		return carDesc;
	}
	
	public String toString()
	{
		String truckString;
		
		truckString = "Fuel Economy: " + super.getFECity() + " City, " + super.getFEHwy() + " Highway. \n";
		truckString += "Seating: " + super.getSeating() + "\n";
		truckString += cargoContainer();
		truckString += description();
		
		return truckString;
	}

}
