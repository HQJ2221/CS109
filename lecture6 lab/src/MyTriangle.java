import java.util.Scanner;
public class MyTriangle {
    public static double area (double a,double b,double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static double peri (double a,double b,double c){
        return a + b + c;
    }
    public static boolean isValid (double a,double b,double c){
        return a + b > c && b + c > a && a + c > b;
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please input three numbers for a, b, c:");
            Scanner input = new Scanner(System.in);
            double a = input.nextDouble();
            if (a == -1) {
                System.out.println("Bye~");
                break;
            }
            double b = input.nextDouble();
            double c = input.nextDouble();
            if (!isValid(a, b, c)) {
                System.out.println("The input is invalid.");
            }else{
                System.out.printf("The area is %.3f\n",area(a,b,c));
                System.out.printf("The perimeter is %.3f\n",peri(a,b,c));
            }
        }
    }
}