package basics;

public class Weathercheck {
	
	public static void main(String[] args) {
		
	
	
	int temperature = 40;
	String sunCondition = "cloudy";
	
	if(temperature>60 && sunCondition == "overcast") {
		System.out.print("sunny day");
	}
	else if(temperature>41 || sunCondition =="cloudy") {
		System.out.println("cloudy, cool day");
	}
	else if(temperature> 80 && sunCondition =="cloudy") {
		System.out.println("don't go out");
	}
}
}