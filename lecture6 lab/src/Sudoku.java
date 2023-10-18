import java.util.Scanner;
public class Sudoku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean b = false;
        int[][][] a = new int[9][3][3];
        for (int i = 0;i < 9;i++){
            for (int j = 0;j < 3;j++){
                for (int k = 0;k < 3;k++){
                    a[i][j][k] = input.nextInt();
                }
            }
        }

    }
}
