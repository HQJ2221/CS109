import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class SoftOpening {
    public static ArrayList<Food> generateMenu() {
        ArrayList<Food> foodList = new ArrayList<>();

        Food pizza1 = new Food();
        pizza1.getID(1);
        pizza1.getName("pizza");
        pizza1.setType("Seafood");
        pizza1.getSize(11);
        pizza1.setPrice(12);

        Food pizza2 = new Food();
        pizza2.getID(2);
        pizza2.getName("pizza");
        pizza2.setType("Beef");
        pizza2.getSize(9);
        pizza2.setPrice(10);

        Food friedRice = new Food();
        friedRice.getID(3);
        friedRice.getName("fried rice");
        friedRice.setType("Seafood");
        friedRice.getSize(5);
        friedRice.setPrice(12);

        Food Noodles = new Food();
        Noodles.getID(4);
        Noodles.getName("noodles");
        Noodles.setType("Beef");
        Noodles.getSize(6);
        Noodles.setPrice(14);

        foodList.add(pizza1);
        foodList.add(pizza2);
        foodList.add(friedRice);
        foodList.add(Noodles);

        return foodList;
    }


    public static User generateUser(Scanner in) {
        User user = new User();
        user.setPassword("123456");
        System.out.print("Generate a user, please input name:");
        user.setUser(in.nextLine());
        System.out.print("balance($):");
        user.setMoney(in.nextDouble());
        return user;
    }

    public static void userConsume(ArrayList<Food> foodList, User user, Scanner in) {
        System.out.println("-------------------welcome,this is Start of the Menu-------------------");
        for (int i = 0; i < 4; i++) {
            foodList.get(i).getMenu();
        }
        System.out.println("-------------------welcome,this is End of the Menu-------------------");
        System.out.println("pleas input the foodID and the number you want,to exit input 0 as foodID");
        double total = 0;
        while (true) {
            System.out.print("food id(input 0 to end select):");
            int id = in.nextInt();
            if (id == 0) {
                System.out.println("select end");
                break;
            }
            System.out.print("number of this food:");
            double num = in.nextDouble();
            total += foodList.get(id - 1).getPrice() * num;
        }
        System.out.printf("Plan to expense %.2f dollar\n", total);
        System.out.println("please input your password:");
        String pw = in.next();
        if (Objects.equals(pw, user.getPassword())) {
            if (total < user.getMoney()) {
                System.out.printf("Expense %.2f dollar and balance %.2f dollar\n", total, user.getMoney() - total);
                user.setMoney(user.getMoney() - total);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Food> foodList = generateMenu(); //generate a Menu
        User user = generateUser(in); //generate a user
        user.introduce(); //show the account of the user
        userConsume(foodList, user, in); //user consume
        user.introduce(); //show the account of the user
        in.close();
    }
}
