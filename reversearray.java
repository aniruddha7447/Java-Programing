package Practice;

public class reversearray {
	public static void reversearray(int num[]) {
		int first =0;int last =num.length-1;
		while(first<last) {
		int temp = num[last];
		num[last]=num[first];
		num[first]= temp;
		}
		first++;
		last--;
		
	}

	public static void main(String[] args) {
		int num[]= {10,3,8,1,2,7,8,9,0};
		reversearray(num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		

	}
	

}
