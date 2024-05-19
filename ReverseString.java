package Practice;

public class ReverseString {
	/*public static void main(String[] args) {
		String str = "ANIRUDDHA";
		str.toCharArray();
		String revstr = "";
		int len=str.length();
		for(int i = len-1; i>=0 ;i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println(revstr);
		*/
	public static void reversestring(String sc) {
		for(int i=sc.length()-1;i>=0;i--) {
			System.out.print(sc.charAt(i));
		}
	}
	public static void main (String args[]) {
		String sc = "Hello world";
		reversestring(sc);
	}
}


