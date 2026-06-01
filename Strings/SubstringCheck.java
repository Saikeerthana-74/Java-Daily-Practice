import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        if(str.contains(sub))
            System.out.println("Substring Found");
        else
            System.out.println("Substring Not Found");
    }
}
