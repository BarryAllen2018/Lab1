public class StuDatabase {

	public static void main(String[] args) {
		
		Student st1 = new Student("AkshayKukkaje","987979");
		st1.Courses();
		st1.setName("Akshay Kukkaje");
		st1.getName();
		st1.generateiD();
		System.out.print(st1.toString());
		Student st2 = new Student("Shivaprasad", "234802");
	}
}
class Student{
	private String name;
	private String SSN;
	private static int iD = 1000;
	private String UniqueiD;
	
	public Student(String name,String SSN) {
		this.SSN=SSN;
		generateemail();
		generateiD();
		iD++;
		
	}
	public void generateiD() {
		int random =(int)(Math.random()*1000);
		String UniqueiD = iD + "" + random+ "" + SSN.substring(2,6);
		System.out.println(iD);
		System.out.println("your Unique ID is "+UniqueiD);
	}
	public void generateemail() {
		String email = name+"@student.edu";
		System.out.println("Your student email iD is : "+email);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void enroll() {
		System.out.println("You are now enrolled");
		
	}
	public void  pay(){
		System.out.println("You have paid the full amount of the fee");
		
	}
	public void checkbalance(){

	}
	public void Courses() {
		System.out.println("Your courses are: Network Theory\n RF Microwaves\n VLSI Design");
		
	}

 public String toString() {
	 return "[" + name +" "+ SSN + UniqueiD + "]\n";
 }


}
