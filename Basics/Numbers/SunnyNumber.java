import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int next = n + 1;
        int root = (int)Math.sqrt(next);

        if(root * root == next)
            System.out.println("Sunny Number");
        else
            System.out.println("Not a Sunny Number");
    }
}
