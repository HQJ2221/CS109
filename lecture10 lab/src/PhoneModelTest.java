import java.util.Scanner;

public class PhoneModelTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your budget: ");
        int budget = input.nextInt();
        boolean b = true;
        for (PhoneModel ph : PhoneModel.values()) {
            if (ph.getPrice() <= budget) {
                System.out.printf("%-10s price: %d\n", ph, ph.getPrice());
                b = false;
            }
        }
        if (b) {
            System.out.println("You do have sufficient money");
        }
    }
}
