package Practice;

public class SecondLargest {
    public static int findSecondLargest(int arr[]) {
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                SecondLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] > SecondLargest && arr[i] != Largest) {
                SecondLargest = arr[i];
            }
        }
        
        return SecondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {11, 44, 33, 22, 66, 55};
        int secondLargest = findSecondLargest(arr);
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
