public class Array2D { //二维数组
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}, {10}};//二维数组可看作是引用一维数组作为元素的一维数组，多维数组亦然
        // loop through rows
        for(int row = 0; row < a.length; row++) {
            // loop through columns
            for(int column = 0; column < a[row].length; column++) {
                System.out.printf("%d ", a[row][column]);
            }
            System.out.println();
        }
    }
}
