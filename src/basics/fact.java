package basics;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}
		public static int fact(int n) {
			if (n==0)
				return 1;
			else {
				int f=1;
				while(n!=1) {
					f=f*n;
					n--;
				}return f;
			}
				
		}
}
