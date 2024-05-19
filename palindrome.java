package Practice;

public class palindrome {
	public static void main(String[] args) {
		String str = "ANIRUDDHA";
		str.toCharArray();
		String revstr = "";
		int len=str.length();
		for(int i = len-1; i>=0 ;i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println(revstr);
		if(str==revstr) {
			System.out.print("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
		}
		
	}
