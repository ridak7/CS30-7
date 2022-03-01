package bank;

public class PersonalAcct extends Account
{
	private double minBal = 100;
	private double balance;

	public PersonalAcct(double bal, String fName, String lName, String str, String city, String prov, String pst) 
	{
		super(bal, fName, lName, str, city, prov, pst);
		
		if (balance < minBal)
		{
			super.withdrawal(2);
		}
	}
	
	
	public String toString()
	{
		String pAccString;
		
		pAccString = super.toString();
		pAccString += "Minimum account balance is $100. If balance falls below $100, $2 is charged to the account.";
		
		return(pAccString);
	}

}
