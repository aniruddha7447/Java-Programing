package Practice;
import java.util.Scanner;
public class PrimeNumber {
	public static boolean isprime(int n) {
		    if(n<2) {
		    	return false;
		    }
			for(int i=2;i<=n-1;i++) {//we can use math fn here i<=math.sqrt
				if(n % i == 0) {
				return false;
				}
			}
			return true;  
	}
	public static void main(String[] args) {
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		if(isprime(num))
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
			
		
	}
}
