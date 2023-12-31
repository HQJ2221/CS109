public class Polymorphism {
    // 多态
    // 多态是指对象具有多种形态，即同一个对象在不同的情况下表现出不同的行为。
    // 可以通过同一接口访问不同类型的对象。每个类型都提供此接口的独立实现。
    // 有效的多态需要三个条件：
    // 1. 继承
    // 2. 重写
    // 3. 向上转型：父类引用指向子类对象
    // 如 Shape shape = new Circle(); Shape shape = new Rectangle(); 等

    //面向对象编程的语言都有多态的特性，如 C++、Java、C# 等
    //当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法
    //多态的实现方式：重写、接口和抽象类

    // 抽象类
    // 抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。
    //由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。
    //父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法。
    //在 Java 中抽象类表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口。
    //抽象类使用 abstract 关键字来定义，抽象方法使用 abstract 关键字来定义，抽象方法只有方法名，没有方法体。

    // 接口
    // 接口是抽象方法和常量值的定义的集合，接口是一种行为的规范，接口是一种引用数据类型，是方法的集合，如果一个类要实现接口，那么这个类要实现接口中所有的方法。
    // 接口的定义格式：
    // [可见度] interface 接口名称 [extends 其他的接口名] {
    //     // 声明变量
    //     // 抽象方法
    // }

    // 静态绑定和动态绑定
    // 静态绑定：在编译时就能确定调用的方法
    // 动态绑定：在运行时才能确定调用的方法
    // 如final、static、private修饰的方法是静态绑定，其余的是动态绑定
    // 静态绑定的方法不能被继承（重写），但是可以被重载，动态绑定相反；
    // 例：
    // class A {
    //     public void f() {
    //         System.out.println("A");
    //     }
    // }
    // class B extends A {
    //     public void f() {
    //         System.out.println("B");
    //     }
    // }
    // 上述代码中，f()方法是动态绑定，因为在编译时无法确定调用的是哪个方法，只有在运行时才能确定
    // 如果将f()方法改为final(or static) void f()，则f()方法是静态绑定，因为在编译时就能确定调用的是哪个方法


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}