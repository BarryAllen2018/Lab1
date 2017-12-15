package LAB;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("456456",6000);
		acc1.setName("Akshay");
		System.out.println(acc1.getName());
		acc1.deposit(5000);
		acc1.paybill(600);
		BankAccount acc2 = new BankAccount("478799",9000);
	}
}
	
 class BankAccount{
	 private String name;
	 private String SSN;
	 private String accountnumber;
	 private static int iD=1000;
	 private static final String routingnumber="987912123";
	 private double balance;
	
	 public BankAccount(String SSN,double initdeposit) {
		 balance = initdeposit;
		 this.SSN = SSN;
		 iD++;
		 System.out.println(iD);
		 setAccountnumber();
	 }
	private void setAccountnumber() {
	//accnumber = iD+randomnumber 2 digit + first 2 digit of SSN
	int random = (int)(Math.random()*100);
	accountnumber = iD + "" + random + "" +SSN.substring(0,2);
	System.out.println("Your Account number is: "+accountnumber);
 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("You've made a deposit of $"+amount);
		showbalance();
	}
	public void paybill(double amount) {
		balance = balance - amount;
		System.out.println("You've made a withdrawal of $"+amount);
		showbalance();
	}
	public void showbalance() {
		System.out.println("Your balance is:" +balance);
	}
}
