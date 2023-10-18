import java.util.Scanner;

public class repetitionStructure {  //一个循环结构的例子：计算若干数的和与平均值
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        System.out.print("Enter grade or -1 to quit:");
        int grade = input.nextInt();
        while (grade != -1) { //循环结构while语句
            if (grade >= 0) { //限制输入正整数
                total += grade;
                gradeCounter++;
                System.out.print("Enter grade or -1 to quit:");//重复输入直到输入-1
                grade = input.nextInt();
                if (gradeCounter != 0) {
                    double average = (double) total / gradeCounter;
                    System.out.printf("\nTotal of the %d grades is %d\n", gradeCounter, total);
                    System.out.printf("Class average is %.2f\n", average);
                }
            } else {
                System.out.println("Grade cannot be negative number!");
                System.out.print("Enter grade or -1 to quit:");
                grade = input.nextInt();
            }
        }
    }
}