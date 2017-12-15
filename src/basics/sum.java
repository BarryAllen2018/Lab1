package basics;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));
	}
		public static int sum(int n) {
				int s=1;
				while(n!=1) {
					s=s+n;
					n--;
				}return s;
			}
	}
