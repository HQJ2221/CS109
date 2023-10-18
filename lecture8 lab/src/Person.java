import java.util.Random;

public class Person {
    private Direction[] directions;
    private int i;
    private int j;
    private int index;
    public static void main(String[] args) {
        Person p = new Person(0,-1,0);
        p.walk(3);
        p.changeDirection();
        System.out.println(p);
        p.walk(5);
        p.changeDirection();
        System.out.println(p);
    }
    public Person walk(int step){
        for(int a = 0; a < step; a++){
            i += directions[index].getRow();
            j += directions[index].getCol();
        }
        return new Person(i,j,index);
    }
    public Person changeDirection(){
        Random random = new Random();
        return new Person(i,j,index = random.nextInt(8));
    }
    public String toString(){
        return "(" + i + "," + j + ")";
    }
    public Person(int i, int j, int index){
        this.i = i;
        this.j = j;
        this.index = index;
        directions = new Direction[8];
        directions[0] = new Direction(0,1);
        directions[1] = new Direction(-1,1);
        directions[2] = new Direction(-1,0);
        directions[3] = new Direction(-1,-1);
        directions[4] = new Direction(0,-1);
        directions[5] = new Direction(1,-1);
        directions[6] = new Direction(1,0);
        directions[7] = new Direction(1,1);
    }

}
