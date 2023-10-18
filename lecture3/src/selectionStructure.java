//三个基本结构：顺序，选择，循环
public class selectionStructure {
    public static void main(String[] args) {
        int a = 6;
        int b = ++a;
        int c = a--;//变量在符号后表示先自增再赋值，变量在符号前表示先赋值再自减
        int c1 = a;//在定义b时a的值已经更改，所以赋给c的值与b相同
        System.out.printf("b=%d\nc=%d\nc1=%d\n", b, c, c1);
        if (c > b) {
            System.out.println("c is bigger than b");
        } else if (c > c1) {
            System.out.println("c is smaller than b, \nbut bigger than c1");
        }//选择结构的一种表达方式
    }
}