package Practice;

public class permutations {
	public static void permu(String str,String ans) {
		//Base case
		if(str.length()==0){
			System.out.println(ans);
			return;
		}
		//recursion
		for(int i=0;i<str.length();i++) {
			
			char curr = str.charAt(i);
			//"abcde"= ab+ de = "abde" we want to remove c
			String NewStr=str.substring(0,i)+str.substring(i+1);//(i+1,str.length-1=() empty
			permu(NewStr,ans+curr);		
		}
	}
	public static void main(String[] args) {
		String str = "abc";
		permu(str, "");
	}

}
