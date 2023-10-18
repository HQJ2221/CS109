import  java.util.Scanner;
public class Exercise5 { //输出九九乘法表
    public static void main(String[] args) {
        System.out.println("Please input a number to print the Multiplication Table [0 to terminate]:");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        while (l != 0){
            int c;
            for (int i = 1;i <= l;i++){
                for (c = 1;c <= i;c++){
                    System.out.printf("%d * %d = %d  ",c,i,c * i);
                }
                System.out.print("\n");
            }
            if (l < 0){
                System.out.println("Please input a number between [1,9]");
                System.out.println("Please input a number to print the Multiplication Table [0 to terminate]:");
                l = input.nextInt();
            }
        }
    }
}
