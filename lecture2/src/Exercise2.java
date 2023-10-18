import java.util.Scanner;
public class Exercise2 {  //换算时间
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int t = input.nextInt();
        int h = t / 3600;
        int min = t % 3600 / 60;
        int sec = t % 3600 % 60;
        System.out.printf("The equivalent time is %d hours %d minutes %d seconds.",h,min,sec);
    }
}