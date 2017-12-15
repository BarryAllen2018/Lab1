package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String career; 								//decalre a variable
		System.out.println("Program is starting");
		career="sofware developer"; 				//define a variable
		System.out.println("My career:"+career);
		
		//calculate salary
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.50;
		
		double salary = rate * hoursperweek * weeksperyear;
		System.out.println("My salary as a" +career + " at the rate of $ " +rate+ "per hour is $" +salary + " per year");
		
	}
}
