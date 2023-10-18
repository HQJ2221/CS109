import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = input.nextInt();
        int[] a = new int[n];
        int total = 0;
        for (int i = 0;i <a.length;i++){
            a[i] = input.nextInt();
            total += a[i];
        }
        double avg = (double)total / n;
        System.out.printf("average=%.1f\n",avg);
        int p = 0;
        for (int i = 0;i <a.length;i++){
            for (int j = i + 1;j < a.length;j++){
                if ((double)(a[i] + a[j]) / 2 > avg){
                    p++;
                }
            }
        }
        System.out.printf("The number of pairs of integer is %s\n",p);
        long current1=System.currentTimeMillis();
        /* your algorithm */
        long current2=System.currentTimeMillis();
        System.out.printf("your program using %.3f second",(current2-current1)/1000.0d);
    }
}
