import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a string (\"quit\" to finish):");
        String str = input.nextLine();
        boolean k = true;
        while (!str.equals("quit")) {
            for (int i = 0; i < str.length() / 2; i++) {
                if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(str.length() - 1 - i))) {
                    k = false;
                    break;
                }
            }
            if (k) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
            System.out.print("Type a string (\"quit\" to finish):");
            str = input.nextLine();
        }
    }
}