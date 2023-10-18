import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Please input 10 scores of these students:");
        Scanner input = new Scanner(System.in);
        double[] score = new double[10];
        double total = 0;
        for (int i = 0;i < score.length;i++){
            score[i] = input.nextDouble();
        }
        double x = 0,y = 100;
        for (double v : score) {
            if (v > x) {
                x = v;
            }
            if (v < y) {
                y = v;
            }
        }
        for (double num : score){
            total += num;
        }
        double avg = (total - x - y) / (score.length - 2);
        System.out.printf("Average score is %.2f",avg);
    }
}
