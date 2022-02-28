import java.util.Scanner;

public class Bank {


	public static void getDetails()
	{
		String fName, lName, str, city, prov, pst;
		
		Scanner i = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		fName = i.next();
		
		Scanner i2 = new Scanner(System.in);
		System.out.print("\n" + "Enter your last name: ");
		lName = i2.next();
		
		Scanner i3 = new Scanner(System.in);
		System.out.print("\n" + "Enter your street: ");
		str = i3.next();
		
		Scanner i4 = new Scanner(System.in);
		System.out.print("\n" + "Enter the city: ");
		city = i4.next();
		
		Scanner i5 = new Scanner(System.in);
		System.out.print("\n" + "Enter the province: ");
		prov = i5.next();
		
		Scanner i6 = new Scanner(System.in);
		System.out.print("\n" + "Enter the postal code: ");
		pst = i6.next();
		
		System.out.print("\n" + fName + " " + lName + " " + str + " " + city + " " + prov + " " + pst);
		
		Customer cust = new Customer(fName, lName, str, city, prov, pst);
	}
	
	public static void main(String[] args) 
	{
		getDetails();

	}

}
