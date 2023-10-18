import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("s1: ");
        String s1 = input.nextLine();
        System.out.print("s2: ");
        String s2 = input.nextLine();
        int count = 0, index = 0;
        while (s1.indexOf(s2,index) != -1) {
            System.out.println("Found at index: " + s1.indexOf(s2,index));
            index = s1.indexOf(s2,index) + 1;
            count++;
        }
        System.out.printf("Total occurrences: %d", count);
    }
}
