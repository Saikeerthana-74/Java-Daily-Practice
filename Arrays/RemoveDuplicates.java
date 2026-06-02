import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int j = 0;

        for(int i = 0; i < n - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }

        temp[j] = arr[n - 1];

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i <= j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
