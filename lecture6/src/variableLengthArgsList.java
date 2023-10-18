public class variableLengthArgsList {
    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        System.out.printf("average of d1 and d2 is %f%n", average(d1, d2));
        System.out.printf("average of d1 ~ d3 is %f%n", average(d1, d2, d3));
    }

    public static double average(double... numbers) {//可变参数列表
        double total = 0.0;
        for (double d : numbers) {
            total += d;
        }
        return total / numbers.length;
    }
}
