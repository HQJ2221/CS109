import java.util.Scanner;
public class Exercise1 { //输入差值精度，计算pi
    public static void main(String[] args) {
        System.out.println("Please input the precision:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        int i = 0;
        double pi = 0;
        double str;
        do{
            str = pi;
            if (i % 2 ==0) {
                pi += (double) 4  / (2 * i + 1);
            }else{
                pi -= (double) 4  / (2 * i + 1);
            }
            i++;
        }while (pi > str + a || pi < str - a);
        System.out.printf("The estimation of Pi is %f\n",pi);
        System.out.printf("It compute %d times.", i + 1);
    }
}
