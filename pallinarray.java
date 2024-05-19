package Practice;

public class pallinarray {
	public static boolean paliarr(int[] arr) {
		boolean ans=true;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					ans=true;
					
				}else {
					ans=false;
				}
			}
		}

		return ans;
		}
	static void answer(int [] arr) {
		paliarr(arr);
		boolean ans = false;
		if(ans) {
			System.out.println("Array is pallindrome.");
		}
		else {
			System.out.println("Array is not pallindrome.");
		}
	}
	
		
	public static void main(String[] args) {
		int [] arr = {1,2,3,3,2,1};
		answer(arr);
	}

}
//wrong code