import java.util.Scanner;
public class Exercise2 { //用for语句计算pi
    public static void main(String[] args) {
        System.out.println("Please input n:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double pi = 0;
        for (int i = 0;i <= a;i++){
            if (i % 2 ==0) {
                pi += (double) 4  / (2 * i + 1);
            }else{
                pi -= (double) 4  / (2 * i + 1);
            }
        }
        System.out.printf("The estimation of Pi is %f",pi);
    }
}
