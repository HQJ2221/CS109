import java.util.Scanner;

public class User {
    private String account;
    private String password;
    private double money;

    public void setUser(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public double getMoney(){
        return money;
    }
    public void introduce() {
        System.out.printf("%s's account has a balance of %.2f dollar\n", account, money);
    }

    public void expense(double value, Scanner in) {
        if (value > money) {
            System.out.println("no sufficient funds");
        } else {
            System.out.printf("You have expense %.2f dollar and the remained amount is %.2f\n", value, money - value);
        }
    }

    public void income(double value) {
        System.out.printf("The remained amount is %.2f\n", money + value);
    }
}

