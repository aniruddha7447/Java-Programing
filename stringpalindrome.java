package Practice;

import java.util.Scanner;

public class stringpalindrome {
	public static void check_palindrome(String word) {
		
		for(int i=0;i<word.length()/2;i++) {
			int n = word.length();
			if(word.charAt(i)!=word.charAt(n-1-i)) {
				System.out.println("failure");
				break;
			}else {
				System.out.println("Success");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length = ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Character = ");
		String word = sc.nextLine();
		if(word.length()==n) {
		check_palindrome(word);
		}else {
			System.out.println("Invalid");
		}
	}

}
