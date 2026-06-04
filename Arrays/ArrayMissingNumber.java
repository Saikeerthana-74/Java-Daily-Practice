import java.util.Scanner;

public class ArrayMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        int sum = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int expectedSum = (n + 1) * (n + 2) / 2;

        System.out.println("Missing Number = " + (expectedSum - sum));
    }
}
