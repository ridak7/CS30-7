package bank;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Bank {


	
	private static String accType, fName, lName, str, city, prov, pst;
	private static double withdrawAmount, depAmount, bal;
	private static int choice;
	static Scanner i = new Scanner(System.in);
	
	
	public static void getDetails() 
	{	
		System.out.print("Enter your first name: ");
		fName = i.nextLine();
		fName = fName.substring(0, 1).toUpperCase() + fName.substring(1);
		
		
		System.out.print("\n" + "Enter your last name: ");
		lName = i.nextLine();
		lName = lName.substring(0, 1).toUpperCase() + lName.substring(1);
		
		System.out.print("\n" + "Enter your street: ");
		str = i.nextLine();
	
		System.out.print("\n" + "Enter the city: ");
		city = i.nextLine();
		city = city.substring(0, 1).toUpperCase() + city.substring(1);
		
		System.out.print("\n" + "Enter the province: ");
		prov = i.nextLine();
		prov = prov.substring(0, 1).toUpperCase() + prov.substring(1);
		
		System.out.print("\n" + "Enter the postal code: ");
		pst = i.nextLine();
		pst = pst.substring(0).toUpperCase();
		
		accountType();
	}
	
	
	
	public static void getOgBalance()
	{
		System.out.print("\n" + "Enter the balance of the account: ");
		bal = i.nextDouble();
		checkAcc();
	}
	
	
	
	public static void accountType()
	{	
		System.out.print("\n" + "Enter account type ('personal' or 'business'): ");
		accType = i.next();
		getOgBalance();
	}
	
	
	
	public static void checkAcc()
	{
		if (accType.equals("personal"))
		{
			PersonalAcct pAcc = new PersonalAcct(bal, fName, lName, str, city, prov, pst);
			System.out.println(pAcc);
		}
		else if (accType.equals("business"))
		{
			BusinessAcct bAcc = new BusinessAcct(bal, fName, lName, str, city, prov, pst);
			System.out.println(bAcc.toString());
		}
		else
		{
			System.out.println("No account type selected");
			accountType();
		}
		
		choice();
	}
	
	
	
	public static void choice()
	{
		System.out.println("\n" + "Enter '1' to start a deposit, '2' to start a withdrawl, '3' to check account type or '4' to quit: ");
		choice = i.nextInt();
		Account acc = new Account(bal, fName, lName, str, city, prov, pst);
		PersonalAcct pAcc = new PersonalAcct(bal, fName, lName, str, city, prov, pst);
		BusinessAcct bAcc = new BusinessAcct(bal, fName, lName, str, city, prov, pst);
		
		switch (choice)
		{
			case 1:
				
				System.out.print("Enter amount to deposit: ");
				depAmount = i.nextDouble(); 
				acc.deposit(depAmount);
				bal = acc.getBalance();
				checkAcc();
				break;
				
			case 2:
			{
				System.out.print("Enter amount to withdraw: ");
				withdrawAmount = i.nextDouble();
				
				if(accType.equals("personal"))
				{
					if (pAcc.checkBal() == true)
					{
						System.out.println("Withdrawing $" + withdrawAmount + "0 will result in a charge of $2. Enter '1' to continue or '2' to stop.");
						int confirm = i.nextInt();
						
						if (withdrawAmount + 2 > bal)
						{
							System.out.println("Not Enough Money in Account.");
							try {
								TimeUnit.SECONDS.sleep(2);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							checkAcc();
						}
						else 
						{
							switch (confirm)
							{
								case 1:
									acc.withdrawal(withdrawAmount + 2);
									System.out.println("$2 penalty charged.");
									try {
										TimeUnit.SECONDS.sleep(2);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
									
								case 2:
									checkAcc();
									break;
							}
						}
					}
					else	
					{
						acc.withdrawal(withdrawAmount);
					}
				} 
				else if (accType.equals("business"))
				{
					if (bAcc.checkBal() == true)
					{
						System.out.println("Withdrawing $" + withdrawAmount + "0 will result in a charge of $10. Enter '1' to continue or '2' to stop.");
						int confirm = i.nextInt();
						
						if(withdrawAmount + 2 > bal)
						{
							System.out.println("Not enough money in account.");
							try {
								TimeUnit.SECONDS.sleep(2);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							checkAcc();
						}
						else
						{
							switch (confirm)
							{
								case 1:
									acc.withdrawal(withdrawAmount + 10);
									System.out.println("$10 penalty charged.");
									try {
										TimeUnit.SECONDS.sleep(2);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
									
								case 2:
									checkAcc();
									break;
							}
						}
					}
					else	
					{
						acc.withdrawal(withdrawAmount);
					}
				}
				
				bal = acc.getBalance();
				checkAcc();
				break;
			}
			
			case 3:
			{
				System.out.print("Account Type: " + accType);
				
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				checkAcc();
				break;
			}
			
			
			case 4:
			{
				System.out.println("Thank you for your business.");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Goodbye.");
				System.exit(0);
			}
					
		}
		
	}
	
	
	
	public static void main(String[] args) 
	{
		getDetails();
		i.close();		
	}

}
