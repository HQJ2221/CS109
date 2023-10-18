import java.util.Scanner;

public class Octagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[n][n];
        for (int i = n / 3;i < n - n / 3;i++){
            a[0][i] = 1;
            a[n - 1][i] = 1;
            a[i][0] = 1;
            a[i][n - 1] = 1;
        }
        for (int i = 1;i < n - 2;i++){
            if (n / 3 - i > 0){
                a[i][n / 3 - i] = 1;
                a[i][n - n / 3 + i] = 1;
                a[n - i - 1][n / 3 - i] = 1;
                a[n - i - 1][n - n / 3 + i] = 1;
            }
        }
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
