package Practice;

import java.util.Scanner;

public class n_fact {
	public static int  nfact (int n) {
		int f = 1;
		for(int i=1;i<=n;i++) {
			  f = f * i;
		}
		 return f;
	}


	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial of number is : " + nfact(n));
	}

}
