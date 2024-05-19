package Practice;

public class sum_recursion {
	public static int sumon(int n) {
		if(n==1) {
			return 1;
		}
		int sopn=sumon(n-1);
		int son=n+sopn;		
		return son; 
		
	}

	public static void main(String[] args) {
		int n =5;
		System.out.println(sumon(n));
	}

}
