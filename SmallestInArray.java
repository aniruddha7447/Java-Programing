package Practice;

public class SmallestInArray {
	public static int smallestnum(int array[]) {
		int smallest = Integer.MAX_VALUE;//+infinity(smallest value infinity ahe ase consider karun chalayach ani sagalya array madhe compare karayache jr small bhetal tr just value update karayachi
		for(int i=0;i<array.length;i++) {
			if(smallest > array[i]) {
				smallest = array[i];
			}
		}return smallest;
		
	}

	public static void main(String[] args) {
		int array [] = {-1,4,6,2,3};
		System.out.println("Smallest number in array is " + (smallestnum(array)));

	}

}
