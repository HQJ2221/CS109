import java.util.ArrayList;

public class beforeExercise {
    private double radius;
    private double x;
    private double y;

    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void position() {
        System.out.printf("Position of the circle is (%.1f,%.1f)\n", x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        beforeExercise c1 = new beforeExercise();

        c1.setRadius(5);
        System.out.println(c1.getRadius());

        System.out.printf("The area of c1 is %.2f\n", c1.area());
        System.out.printf("The perimeter of c1 is %.2f\n", c1.perimeter());
        c1.position();

        ArrayList<beforeExercise> circleList = new ArrayList<>();
        circleList.add(c1);
        System.out.printf("Radius of %d circle is %.2f: \n", 1, circleList.get(0).getRadius());
        for (int i = 1; i < 5; i++) {
            circleList.add(new beforeExercise());
            circleList.get(i).setRadius(i);
            circleList.get(i).setX(Math.random() * 5);
            circleList.get(i).setY(Math.random() * 5);
        }

        System.out.println("---Begin to print the circle list---");
        for (int i = 0; i < 5; i++) {
            System.out.printf("The area of %d circle is %.2f\n", i + 1, circleList.get(i).area());
            System.out.printf("The perimeter is %.2f\n", circleList.get(i).perimeter());
        }
    }
}