import java.util.Random;
import java.util.Scanner;
public class Exercise4 {  //个位数乘法练习
	public static void main(String[] args) {
        for (int i = 0;i <= 10;i++){
		Random random = new Random();
		int a = random.nextInt(1,100);
		int b = random.nextInt(1,100);
		System.out.println("Please calculate:");
		System.out.printf("%d*%d=",a,b);
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		while (c != a * b){
			System.out.println("Oops! Try again:");
			System.out.printf("%d*%d=",a,b);
			c = input.nextInt();
		}
		System.out.println("Correct!");
		}
	}
}