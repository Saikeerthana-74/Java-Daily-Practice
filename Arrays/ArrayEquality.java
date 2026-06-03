import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter first array elements:");

        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array elements:");

        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean equal = true;

        for(int i = 0; i < n; i++) {
            if(arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }

        if(equal)
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are Not Equal");
    }
}
