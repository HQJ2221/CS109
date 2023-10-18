import java.util.Scanner;
import java.util.Arrays;
public class CowCollege {//计算学费和的最大值（有相同时取较低的学费）
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        long[] fee = new long[(int)N];
        for (int i = 0;i < N;i++){
            fee[i] = input.nextLong();
        }
        Arrays.sort(fee);
        long[] total = new long[(int)N];
        long lastTotal = 0;
        long lastFee = 0;
        long k = 1;
        for (long i = N - 1;i > 0;i--){
            total[(int)i] = k * fee[(int)i];
            k++;
            if (total[(int)i] > lastTotal){
                lastTotal = total[(int)i];
                lastFee = fee[(int)i];
            } else if (total[(int)i] == lastTotal && fee[(int)i] <= lastFee) {
                lastTotal = total[(int)i];
                lastFee = fee[(int)i];
            }
        }
        System.out.printf("%d %d",lastTotal,lastFee);
    }
}