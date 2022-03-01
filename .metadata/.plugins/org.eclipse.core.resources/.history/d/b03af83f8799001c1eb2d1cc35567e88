
public class PersonalAcct extends Account
{
	private double minBal = 100;

	public PersonalAcct(double bal, String fName, String lName, String str, String city, String prov, String pst) 
	{
		super(bal, fName, lName, str, city, prov, pst);
		
		if (bal < minBal)
		{
			super.withdrawal(2);
		}
	}

}
