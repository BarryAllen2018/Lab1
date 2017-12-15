package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"Irvine", "Long Beach", "Fulelrton", "SFO"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
				
		String[] states= new String[3];
		 states[0]="California";
		 states[1]="Nevada";
		 states[2]="Illinois";
		 System.out.println(states[2]);
		 int i=0;
		 do {
			 System.out.println(states[i]);
			 i++;
		 }
		 while(i<3);
		 
		 
	}

}
