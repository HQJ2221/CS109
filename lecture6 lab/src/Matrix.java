import java.util.Scanner;
public class Matrix {
    public static int[][] result(int[][] matrix1,int row1,int col1,int[][] matrix2,int row2,int col2){
        int[][] result = new int[row1][col2];
        if (col1 == row2){
            for (int i = 0;i < row1;i++){
                for (int k = 0;k < col2;k++){
                    for (int j = 0;j < col1;j++){
                        result[i][k] += matrix1[i][j] * matrix2[j][k];
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of matrices: ");
        int N = input.nextInt();
        int[][][] matrix1 = new int[N][][];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the number of row and column of matrix 1: ");
            int row = input.nextInt();
            int col = input.nextInt();
            int[][] matrix = new int[row][col];
            System.out.println("Enter the elements of the matrix:");
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    matrix[j][k] = input.nextInt();
                }
            }
            if (i == 0){
                matrix1[i] = matrix;
            }else{
                matrix1[i] = new int[matrix1[i-1].length][col];
                matrix1[i] = result(matrix1[i-1],matrix1[i-1].length,row,matrix,row,col);
            }
        }
        System.out.println("The result:");
        for (int i = 0;i < matrix1[N-1].length;i++){
            for (int j = 0;j < matrix1[N-1][i].length;j++){
                System.out.printf("%d ",matrix1[N-1][i][j]);
            }
            System.out.println();
        }
    }
}