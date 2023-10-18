import java.util.Scanner;
public class gradeSheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of subjects: ");
        int subNum = input.nextInt();
        System.out.println("Please enter the number of students: ");
        int stuNum = input.nextInt();
        double[][] gra = new double[subNum][stuNum];
        if (subNum < 10 && stuNum < 10){
            for (int k = 0;k < subNum;k++){
                for (int i = 0;i < stuNum;i++){
                    gra[k][i] = input.nextDouble();
                }
            }
            System.out.print("       ");
            for (int i = 0;i < subNum;i++){
                System.out.printf("Course%d  ",i + 1);
            }
            System.out.println("   Average");
            for (int i = 0;i < stuNum;i++){
                System.out.printf("Student%d   ",i + 1);
                double total = 0;
                for (int k = 0;k < subNum;k++){
                    total += gra[k][i];
                    System.out.printf("%.0f       ",gra[k][i]);
                }
                System.out.printf("%.2f",total / subNum);
                System.out.println();
            }
            System.out.print("Average    ");
            for (int k = 0;k < subNum;k++){
                double total = 0;
                for (int i = 0;i < stuNum;i++){
                    total += gra[k][i];
                }
                System.out.printf("%.2f    ",total / stuNum);
            }
        }
    }
}
