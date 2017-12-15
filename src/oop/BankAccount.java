package oop;

public class BankAccount {
	String accountnumber;
	String name;
	String ssn;
	String accounttype;
	double balance;
	private static final String routingnumber="79879879";


	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	BankAccount(String accounttype){
		System.out.println("NEW ACCOUNT TYPE:" +accounttype);
	}
	BankAccount(String accounttype, double initdeposit){
		System.out.println("Account type: "+accounttype + ", deposit of:" +initdeposit);
		balance = initdeposit; 	
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "Mr."+name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void deposit(double amount) {
		balance=balance+amount;
		showactivity("deposit");
		
	}
	void withdraw(double amount) {
		balance=balance-amount;
		showactivity("WITHDRAW");
	}
	private void showactivity(String activity) {
		System.out.println("your recent transaction is " +activity);
		System.out.println("balance is $" + balance);
	}
	@Override
	public String toString() {
		return "[" + name + ", " + accountnumber+ ", routing number:"+ routingnumber + ", $ "+ balance+ ",]" ;
	}
	
}
