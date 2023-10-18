import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int l = input.nextInt();
        int[] list1 = new int[l],list2 = new int[l];
        System.out.print("Enter the 1st integer array of size 4:");
        for (int i = 0;i < list1.length;i++){
            list1[i] = input.nextInt();
        }
        System.out.print("Enter the 2st integer array of size 4:");
        for (int i = 0;i < list1.length;i++){
            list2[i] = input.nextInt();
        }
        String p = "";
        for (int i = 0;i < list1.length;i++){
            if (list1[i] == list2[i]){
                p = "true";
            }else {
                p = "false";
                break;
            }
        }
        if (p.equals("true")){
            System.out.println("The two arrays are equal.");
        }else {
            System.out.println("The two arrays are not equal.");
        }
    }
}
