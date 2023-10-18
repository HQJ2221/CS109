import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input number n:");
        int n = input.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + (char) (97 + i);// str = new String("abc"+"d"); time-consuming
            System.out.println(str);
        }
    }
}
