/*
 * Purpose: Create a staff class the inherits UEmployee and returns the job title.
 */
package university;

public class Staff extends UEmployee
{
	/*
	 * Declare variables
	 */
	String jobTitle;
	
	/*
	 * Create a new Staff object
	 */
	public Staff(String jobT, String n, double s)
	{
		super(n, s);
		jobTitle = jobT;
	}
	
	/*
	 * Return the job title
	 */
	public String getTitle()
	{
		return jobTitle;
	}
	
	/*
	 * Return info as string
	 */
	public String toString()
	{
		String staffString;
		
		staffString = super.toString();
		staffString += " They are part of the staff and their job title is: " + getTitle() + ".";
		
		return staffString;
	}
}
