package Practice;

public class StringS {
	public static int uppercase(String sc) {
		int count = 0;
		for(int i=0;i<sc.length();i++){
			if(sc.charAt(i)>=65 && sc.charAt(i)<=90){
				count++;
			}
	}
		return count;
	}
		

	public static void main(String[] args) {
		/*String sc = "Hello world";
		for(int i=0;i<sc.length();i++) {
			
			System.out.println(sc.charAt(i));
		}
	}*/
		String sc = "Hello World";
		System.out.println(uppercase(sc));
		}
}
	