/*
 * Purpose: Create a personal account class that inherits the account class.
 */
package bank;

public class PersonalAcct extends Account
{
	/**
	 * Create a new personal account
	 * 
	 * @param bal
	 * @param fName
	 * @param lName
	 * @param str
	 * @param city
	 * @param prov
	 * @param pst
	 */
	public PersonalAcct(double bal, String fName, String lName, String str, String city, String prov, String pst) 
	{
		super(bal, fName, lName, str, city, prov, pst);	
	}
	
	/*
	 * Return a string that details account info as well as personal account info 
	 */
	public String toString()
	{
		String pAccString;
		
		pAccString = super.toString();
		pAccString += "\n" + "Minimum account balance is $100. If balance falls below $100, $2 is charged to the account.";
		
		return(pAccString);
	}

}
