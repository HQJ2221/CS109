import java.util.Random;

public class Circle {
    private double radius;
    private double x;
    private double y;

    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(5, 10);
        Circle[] circles = new Circle[N];
        int a = 0, b = 0;
        for (int i = 0; i < N; i++) {
            circles[i] = new Circle(random.nextDouble(1.0, 3.0), random.nextDouble(2.0, 5.0), random.nextDouble(2.0, 5.0));
        }
        double minArea = circles[0].area();
        double maxDistance = circles[0].distanceToOrigin();
        System.out.printf("Circle #1: radius = %.2f, x = %.2f, y = %.2f\n", circles[0].radius, circles[0].x, circles[0].y);
        for (int i = 1; i < N; i++) {
            if (circles[i].area() < minArea) {
                minArea = circles[i].area();
                a = i + 1;
            }
            if (circles[i].distanceToOrigin() > maxDistance) {
                maxDistance = circles[i].distanceToOrigin();
                b = i + 1;
            }
            System.out.printf("Circle #%d: radius = %.2f, x = %.2f, y = %.2f\n", i + 1, circles[i].radius, circles[i].x, circles[i].y);
        }
        System.out.printf("Circle #%d is the smallest circle, area = %.2f\n", a, minArea);
        System.out.printf("Circle #%d is the farthest circle, distance to origin = %.2f\n", b, maxDistance);
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}