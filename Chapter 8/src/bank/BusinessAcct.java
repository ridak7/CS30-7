/*
 * Purpose: Create a business account class that inherits the account class.
 */
package bank;

public class BusinessAcct extends Account
{

	/**
	 * Create a new business account
	 * 
	 * @param bal
	 * @param fName
	 * @param lName
	 * @param str
	 * @param city
	 * @param prov
	 * @param pst
	 */
	public BusinessAcct(double bal, String fName, String lName, String str, String city, String prov, String pst) 
	{
		super(bal, fName, lName, str, city, prov, pst);
	}
	
	/*
	 * Return a string that details account info as well as business account info
	 */
	public String toString()
	{
		String bAccString;
		
		bAccString = super.toString();
		bAccString += "\n" + "Minimum account balance is $500. If balance falls below $500, $10 is charged to the account.";
		
		return(bAccString);
	}

}
