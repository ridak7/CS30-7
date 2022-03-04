package vehicle;

public class Car extends Vehicle
{
	private double carg;

	public Car(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(9, 8, 5, 360);
		carg = cargo;
	}
	

	@Override
	String cargoContainer() 
	{
		String cargoString = ("Cargo container type: Trunk, with a capacity of: " + carg + "L.");
		return (cargoString);
	}

	@Override
	String description() 
	{
		String carDesc = ("Cars are typically used for point-point driving and daily use, as they are small, fuel efficient and depending on the brand, reliable.");
		return carDesc;
	}

}
