import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char ch;
        int count;

        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}
