import java.util.Scanner;

import static java.lang.Character.isWhitespace;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type a string:");
        String str = input.nextLine();
        if (str.length() == 0) {
            System.out.println("Empty string, exit…");
        } else {
            str = removeWhitespace(str);
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        str = str.substring(0, i) + str.substring(i + 1);
                        i--;
                        break;
                    }
                }
            }
            System.out.println("After removing repeating chars and spaces: " + str);
        }
    }

    public static String removeWhitespace(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isWhitespace(str.charAt(i))) {
                str = str.substring(0, i) + str.substring(i + 1);
            }
        }
        return str;
    }
}
