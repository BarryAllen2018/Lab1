package oop;

public class BankaccApp {

	public static void main(String[] args) {
		
		BankAccount bac1= new BankAccount();
			
		bac1.setName("Akshay Kukkaje");
		System.out.println(bac1.getName());
		bac1.setSsn("35345353");
		System.out.println(bac1.getSsn());
		bac1.accountnumber="3475395";
			//bac1.name="Akshay";
			bac1.deposit(5000);
			
		
		BankAccount bac2= new BankAccount("checking account");
		
		BankAccount bac3=new BankAccount("Savings Account", 3000);
		bac3.withdraw(5000);
		bac3.deposit(7000);
		
		System.out.println(bac1.toString());
		
		CDAccount cd1= new CDAccount();
		
		cd1.interestrate="11.5%";
		cd1.name="akshaykukkaje";
		cd1.accountnumber="45702823";
		cd1.deposit(5000);
	} 

}
