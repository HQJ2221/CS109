import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you will input: ");
        int N = input.nextInt();
        int[] array = new int[N];
        for (int i = 0;i < array.length;i++){
            array[i] = input.nextInt();
        }
        for (int a = 0;a < array.length;a++){
            for (int i = 0;i < array.length - 1 - a;i++){
                if (array[i+1] < array[i]){
                    int term;
                    term = array[i];
                    array[i] = array[i+1];
                    array[i+1] = term;
                }
            }
        }
        for (int j : array) {
            System.out.printf("%d ", j);
        }
    }
}
