public class Object {
    private String name;
    //对象属性在类声明中表示为变量 (称为字段)
    //对象的状态由这些属性的值决定
    //类的每个对象 (实例) 在内存中都有自己的属性副本，表示该属性的字段也被称为实例变量
    public static void main(String[] args) {
        //class – a car’s engineering drawings (blueprint)
        //method – designed to perform tasks (make a car move)
        //object – the car we drive
        //method call – perform a task (pressing the gas pedal)
        //instance variable – to specify the attributes (the amount of gas)
        //对象具有与程序中使用的对象一起携带的属性,这些属性称为实例变量。
        //实例变量是对象的状态的一部分，它们的值随时间而变化。
        //实例变量的值是在对象创建时设置的，或者在对象创建后通过调用方法来设置。

        //声明一个类(class)
        //任意声明类包含关键词class，后跟类名
        //访问修饰符public表示声明的类对所有地方的所有类都是可见的。

        //声明一个方法(method)
        //任意声明方法包含关键词public，后跟返回类型，方法名，参数列表，方法体。
        //访问修饰符public表示声明的方法对所有地方的所有类都是可见的。
        //返回类型是方法返回的数据类型，如果方法不返回任何值，则返回类型为void。

        //声明一个对象(object)并调用方法
        //声明一个对象包含关键词new，后跟类名，后跟一对圆括号。如 getName name = new getName();
        //空括号表示不向构造函数传递任何参数

        //声明的每个类都可以提供一个称为构造函数的特殊方法，该方法可以在创建对象时用于初始化类的对象
        //Java需要对创建的每个对象进行构造函数调用
        //关键字new从系统请求内存来存储对象，然后调用相应类的构造函数来初始化对象
        //编译器提供了一个默认的构造函数，在没有显式包含构造函数的任何类中没有参数
        //当一个类只有默认构造函数时，它的实例变量会被初始化为默认值 (例如，一个int变量得到值0)
        //构造函数的名称和类名称相同。像方法一样，构造函数的参数列表指定其任务所需的数据
        //构造函数和方法的主要区别在于，构造函数不能返回值，所以构造函数没有返回类型

        Object name = new Object();
        System.out.println(name.getName()); //唯一调用非静态方法的方法是通过对象引用
    }
    public String getName(){
        name = new java.util.Scanner(System.in).nextLine();
        return name;
    }
}