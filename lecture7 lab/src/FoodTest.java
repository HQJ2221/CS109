import java.util.ArrayList;
public class FoodTest {
    public static void main(String[] args) {
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

        for (int i = 0; i < 4;i++){
            System.out.println(foodList.get(i).toString());
        }
    }
}
