package bank;

public class Customer {
	private String firstName, lastName, street, cit, province, post;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String city, String prov, String pst) {
		firstName = fName;
		lastName = lName;
		street = str;
		cit = city;
		province = prov;
		post = pst;
	}
	

	/**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += cit + ", " + province + "  " + post + "\n";
	 	return(custString);
	}
}