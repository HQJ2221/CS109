import java.util.Random;//Random，用于随机生成数据的类
import java.util.Scanner;
public class Exercise3 {  //随机生成一个0~9的数，猜测数字
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        int magicNum = ran.nextInt(10);
        System.out.println("Please input an integer in {0,1,2,...,9}:");
        int inputNum = input.nextInt();
        while (inputNum != magicNum){
            if (inputNum > magicNum){
                System.out.println("Too big! Try again:");
            }else{
                System.out.println("Too small! Try again:");
            }
            inputNum = input.nextInt();
        }
        System.out.println("Congratulations!");
        input.close();//指关闭Scanner功能？
    }
}
