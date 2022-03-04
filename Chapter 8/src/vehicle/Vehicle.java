package vehicle;

/**
 * Vehicle class.
 */
abstract class Vehicle {
	private int fuelEconomyCity, fuelEconomyHwy;
	private int seatingCapacity;
	private double cargoVolume;

	/**
	 * constructor
	 * pre: none
	 * post: A vehicle has been created.
	 */
	public Vehicle(int fECity, int fEHwy, int seating, double cargo) {
		fuelEconomyCity = fECity;
		fuelEconomyHwy = fEHwy;
		seatingCapacity = seating;
		cargoVolume = cargo;
	}
	
		
	/**
	 * Returns the fEHwy
	 * pre: none
	 * post: The highway fuel economy has been returned
	 */
	 public int getFEHwy() {
	 	return(fuelEconomyHwy);
	 }


	/**
	 * Returns the fECity
	 * pre: none
	 * post: The city fuel economy has been returned
	 */
	 public int getFECity() {
	 	return(fuelEconomyCity);
	 }


	/**
	 * Returns the seating capacity
	 * pre: none
	 * post: The seating capacity has been returned
	 */
	 public int getSeating() {
	 	return(seatingCapacity);
	 }


	/**
	 * Returns the cargo volume
	 * pre: none
	 * post: The cargo volume has been returned
	 */
	 public double getCargoVolume() {
	 	return(cargoVolume);
	 }


	/**
	 * Should return the appropriate name of the cargo area
	 * and the capacity.
	 * pre: none
	 * post: The name of the cargo container and its capacity 
	 * has been returned
	 */
	abstract String cargoContainer();
	
	
	/**
	 * Should return a description of the car's typical use
	 * pre: none
	 * post: A description of the car's typical use has been returned.
	 */
	abstract String description();
}