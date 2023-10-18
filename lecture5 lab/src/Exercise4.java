import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] array = new int[10000];
        int i = 0;
        do {
            array[i] = input.nextInt();
            i++;
        }while (array[i-1] != 0);
        int[] time = new int[array.length];
        for (int b = 1;b <= 100;b++){
            for (int c = 0;c < i;c++){
                if (array[c] == b){
                    time[b]++;
                }
            }
            if (time[b] == 0){
                System.out.print("");
            }else if (time[b] ==1){
                System.out.printf("%s occurs %s time\n",b,time[b]);
            }else {
                System.out.printf("%s occurs %s times\n",b,time[b]);
            }

        }
    }
}
