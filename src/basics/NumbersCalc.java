package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		int numA=10;
		int numB=20;
		
		printname();
		add(numA,numB);
		System.out.println("product of the numbers is "+ mul(numA,numB));
		
	}
	static void printname() {
		System.out.println("MY name is Akshay");
	}
	static void add(int numberA, int numberB) {
		int sum=numberA+numberB;
		System.out.println("the sum of numbers is " + sum);
	}

	static int mul(int valueA, int valueB) {
	int product = valueA * valueB;
	return product;
    }
}
