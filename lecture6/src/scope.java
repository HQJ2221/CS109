public class scope {
    //基本范围规则
    //1.局部变量的作用域是从声明处开始，到包含它的代码块结束为止
    //2.局部变量的作用域不会扩展到包含它的代码块之外
    //3.方法或字段的作用域是类的整个主体
    private static int x = 1;

    public static void useLocalVariable() {
        int x = 25;//每次调用方法时，都会创建一个新的局部变量x
        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
        ++x;//修改局部变量x
        System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    }
    //在每次调用期间修改类作用域的字段x
    public static void useField() {
        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x *= 10;//修改类作用域的字段x
        System.out.printf("field x before exiting method useField is %d%n", x);
    }
    //main方法创建并初始化局部变量x，然后调用useLocalVariable和useField方法
    public static void main(String[] args) {
        int x = 5;//main方法创建并初始化局部变量x
        System.out.printf("local x in main is %d%n", x);
        useLocalVariable();//方法包含局部变量x
        useField();//useField使用类范围的字段x，而不是方法的局部变量x
        useLocalVariable();//方法重新初始化局部变量x
        useField();//类范围的字段x保留其值
        System.out.printf("%nlocal x in main is %d%n", x);
    }
}
