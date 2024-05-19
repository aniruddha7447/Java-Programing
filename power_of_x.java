package Practice;

public class power_of_x {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int powxm1 = power(x,n-1);
		int powx =x * powxm1;
		return powx;
	}

	public static void main(String[] args) {
		System.out.println(power(5,2));

	}

}
