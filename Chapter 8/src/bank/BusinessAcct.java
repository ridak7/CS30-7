package bank;

public class BusinessAcct extends Account
{
	private double minBal = 500;
	private double balance;

	public BusinessAcct(double bal, String fName, String lName, String str, String city, String prov, String pst) 
	{
		super(bal, fName, lName, str, city, prov, pst);
		balance = bal;
		
	}
	
	public void checkBal()
	{
		if (balance < minBal)
		{
			super.withdrawal(10);
		}
	}
	
	public String toString()
	{
		String bAccString;
		
		bAccString = super.toString();
		bAccString += "\n" + "Minimum account balance is $500. If balance falls below $500, $10 is charged to the account.";
		
		return(bAccString);
	}

}
