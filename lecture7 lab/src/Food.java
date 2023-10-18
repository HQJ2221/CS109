public class Food {
    private int id;
    private String name;
    private String type;
    private int size;
    private double price;

    public void getMenu(){
        System.out.printf("[id] %d  [type] %-10s[name] %-11s[size]%4d(Inches) %.2f $\n",id,type,name,size,price);
    }

    public void getID(int id){
        this.id = id;
    }
    public void getName(String name){
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void getSize(int size){
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public String toString(){
        return type +" "+ name + ": (" + size + " inches) " + price + " $";
    }
}
