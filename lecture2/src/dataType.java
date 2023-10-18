import java.util.Scanner; //导入一个java.util的包（总称API，程序编程接口），能提供常用类库（Scanner是类）
public class dataType { //声明一个类，注意区分大小写，了解大小驼峰命名
    public static void main(String[] args) { //声明主要方法
        System.out.print("Please input a number:");
        /* print语句会输出一个字符串，且不换行；
           println语句会输出一个语句，且换行；
           printf语句会显示格式化数据。 */
        Scanner k = new Scanner(System.in); //这里的k是Scanner的一个对象名，可执行Scanner方法的功能并调用
        //line1已调用Scanner“工具包”，作用是从输入端拿取数据，()内为拿取数据的位置
        double a = k.nextDouble();          //这里用k所执行的输入功能为a所在的数据空间赋值
        //k后面的内容含有(),表示在k中寻找并使用一个使用方法；若无则表示在k中打开一个工具包
        System.out.printf("%6.3f\n%.2f\n",a,a);   /*格式化数据中，%f为数据格式，
                                                  小数点前表示数据占位数（负数左对齐，正数右对齐），
                                                  小数点后为保留小数位数*/
        // \n 为转义序列，表示光标移动到下一行开头
        // \t 水平选项卡：将光标移动到下一个制表位
        // \r 运输返回：将光标定位在当前行的开头 (不前进到下一行)，回车后的任何字符输出都会覆盖该行的字符输出
        // \\  \"  打印斜杠后的字符
        System.out.print("Input an integral:");
        int b = k.nextInt();
        char c1 = '\u4f55'; char c2 = '\u542f'; char c3 = '\u921e';//Unicode码，char型数据，可转为汉字
        System.out.printf("%s\n",b); // %s为整形数据，%c为字符数据
        System.out.printf("%2c%2c%2c",c1,c2,c3);
    }
}