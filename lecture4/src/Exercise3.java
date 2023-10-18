import java.util.Scanner;
public class Exercise3 { //计算GPA
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gpa;
        int total = 0;
        int cre = 0;
        int c = input.nextInt();
        do{
            int s = input.nextInt();
            switch (s/10){
                case (10):
                case (9):
                    gpa = 4;
                    break;
                case (8):
                    gpa = 3;
                    break;
                case (7):
                    gpa = 2;
                    break;
                case (6):
                    gpa = 1;
                    break;
                default:
                    gpa = 0;
            }
            total += gpa * c;
            cre += c;
            c = input.nextInt();
        }while (c != -1);
        float avg = (float)total / cre;
        System.out.printf("%.1f",avg);
    }
}