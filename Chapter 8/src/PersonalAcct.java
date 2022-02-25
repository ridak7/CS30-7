
public class PersonalAcct extends Account
{
	double minBal = 100;
	double penalty = 2;

	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		bal = super.getBalance();
		
		if (bal < minBal)
		{
			bal = bal - penalty;
		}
	
	}

}
