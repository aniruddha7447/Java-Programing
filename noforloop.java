package Practice;

import java.util.Scanner;

public class noforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be found: ");
        int number = sc.nextInt();
        int[] numbers = {25, 36, 45, 56};

        for (int num : numbers) {
            if (number == num) {
                System.out.println("Your number " + number + " is present in this array.");
                return;
            }
        }
        System.out.println("Your number " + number + " is not present in this array.");
    }
}
