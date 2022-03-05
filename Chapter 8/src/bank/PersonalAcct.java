package bank;

public class PersonalAcct extends Account
{

	public PersonalAcct(double bal, String fName, String lName, String str, String city, String prov, String pst) 
	{
		super(bal, fName, lName, str, city, prov, pst);
		
	}
	
	public String toString()
	{
		String pAccString;
		
		pAccString = super.toString();
		pAccString += "\n" + "Minimum account balance is $100. If balance falls below $100, $2 is charged to the account.";
		
		return(pAccString);
	}

}
