//继承
// 继承是面向对象编程的一个重要特征
// 继承是指一个类可以从另一个类继承数据和方法，继承的类称为子类，被继承的类称为父类
// 子类继承父类的数据和方法，子类可以直接使用父类的数据和方法，也可以对父类的数据和方法进行重写
// 子类继承父类的private数据和方法，但是不能直接访问；父类的protected对象可以被子类访问(不推荐)，但是不能被子类修改

// extends
// extends关键字用于继承父类，子类继承父类的数据和方法
// 如子类和父类的数据和方法同名，子类的数据和方法会覆盖父类的数据和方法

// override
// 子类可以重写父类原有的方法(方法名相同)，调用时会优先调用子类的方法
// 重写方法的返回值类型必须和父类的方法返回值类型相同或者是其派生类
// 访问权限不能比父类中被重写的方法的访问权限更低: public > protected > default > private
// 声明为 static 的方法不能被重写，但是能够被再次声明。
// 子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为 private 和 final 的方法。
// 子类和父类不在同一个包中，那么子类只能够重写父类的声明为 public 和 protected 的非 final 方法。
// 构造方法，不能被继承，也不能被重写

// super
// super关键字用于子类调用父类的数据和方法
// 与this关键字类似，super也是一个引用，this是对当前对象的引用，super是对父类对象的引用
// super()用于子类调用父类的构造方法，必须放在子类构造方法的第一行
// super.方法名()用于子类(可在方法内)调用父类的方法

// overload
// 方法重载是指在一个类中定义了多个同名的方法，但是这些方法的参数个数或者参数类型不同，这些方法的返回值可以相同也可以不同

class Vehicle {
    public int number_wheels = 4;

    public void does() {
        System.out.println("Transporting");
    }
}

class Truck extends Vehicle {
    public int size_container = 500;
}

public class Inheritance {
    public static void main(String[] args) {
        Truck obj = new Truck();
        System.out.println(obj.number_wheels);
        System.out.println(obj.size_container);
        obj.does();
        // Truck继承了Vehicle的数据和方法
    }
}
// 修饰符protected
// protected修饰符修饰的数据和方法可以被子类访问，但是不能被其他类访问
// protected修饰符修饰的数据和方法可以被同一个包中的其他类访问
// protected修饰符修饰的数据和方法可以被不同包中的子类访问
// protected修饰符修饰的数据和方法可以被该包的父类访问
/* Modifier   Class    Package    Subclass    World
 * public      Y        Y          Y           Y
 * protected   Y        Y          Y           N
 * no modifier Y        Y          N           N
 * private     Y        N          N           N
* */
