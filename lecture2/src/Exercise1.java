import java.util.Scanner;

public class Exercise1 {  //计算矩形面积与周长
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of a rectangle:");
        double a = input.nextDouble();
        System.out.print("Enter the length of a rectangle:");
        double b = input.nextDouble();
        double area = a * b; //计算面积
        double peri = 2 * (a + b); //计算周长
        System.out.printf("The area is %.2f\n",area); //保留两位小数
        System.out.printf("The perimeter is %.2f",peri);
    }
}
