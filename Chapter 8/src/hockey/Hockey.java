/*
 * Purpose: Create a Hockey application to test the puck class.
 */
package hockey;

public class Hockey {

	/*
	 * Declare variables
	 */
	static Puck ice = new Puck(4.3);
	static Puck puck1 = new Puck(5.3);
	static Puck puck2 = new Puck(3.8);
	
	/*
	 * Return the puck weight, division and determine whether the puck objects are equal using radius and weight
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("Puck weight: " + ice.getWeight());
		System.out.println("Puck Division: " + ice.getDivision());
		
		
		if (puck1.equals(puck2))
		{
			System.out.println("The objects are equal");
		}
		else
		{
			System.out.println("The objects are not equal");
		}
		
		if (puck1.compareTo(puck2) == 0)
		{
			System.out.println("The weight of the two objects is the same");
		}
		else if (puck1.compareTo(puck2) < 0)
		{
			System.out.println("puck 1 is lighter than puck 2");
		}
		else
		{
			System.out.println("puck 1 is heavier than puck 2");
		}
		
		System.out.println(puck1);
		System.out.println(puck2);
	}

}
