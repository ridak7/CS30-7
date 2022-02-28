
public class PersonalAcct extends Account
{
	private double minBal = 100;

	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal, fName, lName, str, city, st, zip);
		
		if (bal < minBal)
		{
			super.withdrawal(2);
		}
	}

}
