package vehicle;

public class Truck extends Vehicle{

	private double carg;
	
	public Truck(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(14, 12, 5, 1500);
		carg = cargo;
	}
	

	@Override
	String cargoContainer() 
	{
		String cargoString = ("Cargo container type: Bed, with a capacity of: " + carg + "L.");
		return (cargoString);
	}

	@Override
	String description() 
	{
		String carDesc = ("Trucks are typically used for towing or carrying large loads. However, they are also very comfortable, making them good vehicles for long distance driving.");
		return carDesc;
	}

}
