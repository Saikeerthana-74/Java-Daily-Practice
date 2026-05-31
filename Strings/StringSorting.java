import java.util.Scanner;
import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        System.out.println("Sorted String: " + new String(arr));
    }
}
