package Practice;

import java.util.Scanner;

public class patterns1 {
	public static void pat1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {//for(int j= 1;j<=i;j++)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n :  ");
		int n = sc.nextInt();
		pat1(n);
	}

}
