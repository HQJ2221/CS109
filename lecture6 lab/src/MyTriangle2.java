import java.util.Scanner;
public class MyTriangle2 {
    public static double area (double bottom,double height){
        return bottom * height / 2;
    }
    public static double area (double a,double b,int angleOfAAndB){
        return a * b * (float)Math.sin(angleOfAAndB) / 2;
    }
    public static void main(String[] args) {
        System.out.println("Please input two numbers for bottom and height:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.printf("The area is %.3f",area(a,b));
        System.out.println("Please input two numbers for a and b:");
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.println("Please input a number in (0, 180) for angle (angle is a float variable):");
        int angle = input.nextInt();
        System.out.printf("The area is %.3f",area(a,b,angle));

    }
}