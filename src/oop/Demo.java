package oop;

class person{
	String name;
	String email; 
	String phone;
	
	void walk() {
		System.out.println(name+ " is walking ");
	}
	void jump() {
		System.out.print(name+" is jumping like crazy");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person person1= new person();
		person1.name ="akshay";
		person1.email="aksahykukkaje@gmial.com";
		person1.phone="947529423424";
		person1.walk();
		person1.jump();
	}

}
