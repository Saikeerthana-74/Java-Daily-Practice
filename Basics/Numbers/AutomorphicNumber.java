import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;

        while(temp > 0) {
            if(temp % 10 != square % 10) {
                System.out.println("Not an Automorphic Number");
                return;
            }

            temp /= 10;
            square /= 10;
        }

        System.out.println("Automorphic Number");
    }
}
