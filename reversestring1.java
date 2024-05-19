package Practice;

public class reversestring1 {
	public static String revstring(String sc) {
		String reverse = " ";
		for(int i=sc.length()-1;i>=0;i--) {
			reverse = reverse + sc.charAt(i);
			}
		return reverse;
	}

	public static void main(String[] args) {
		String sc = "Hello";
		System.out.println(revstring(sc));;
								

	}

}
