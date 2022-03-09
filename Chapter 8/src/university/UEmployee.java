/*
 * Purpose: Create a UEmployee class that returns the employee name and salary.
 */
package university;

public class UEmployee 
{
	/*
	 * Declare variables
	 */
	String employeeName;
	Double salary;
	
	/*
	 * Create a new UEmployee object
	 */
	public UEmployee(String n, Double s)
	{
		employeeName = n;
		salary = s;
	}
	
	/*
	 * Return name
	 */
	public String getName()
	{
		return employeeName;
	}

	/*
	 * Return salary
	 */
	public Double getSalary()
	{
		return salary;
	}
	
	/*
	 * Return info as string
	 */
	public String toString()
	{
		String uEmp;
		
		uEmp = "\nThe employee name is " + getName() + " and their salary is $" + getSalary() + "0.";
		
		return uEmp;
	}
	
}
