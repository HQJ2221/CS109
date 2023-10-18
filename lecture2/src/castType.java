//有关数据格式以及强制转换格式的笔记
public class castType {
    public static void main(String[] args) {
        //浮点数数据类型：float和double
        //float储存的数据大小为32bits，double（64bits）更精确
        byte b3=(byte)300; //这里将int类型数据强制转换为byte类型
        System.out.println(b3);//向“低等”类型转换容易损失数据,此处按二进制输出44。
        //java的数据类型分为基础类型和引用类型
        int a = 9;
        int b = 2;
        float f =  a / b - 1.5f;// 1.5f如果不加f默认为double类型，然后报错
        // a/b默认结果为整数,向下取整，导致计算不正确，以下为修正
        System.out.printf("The false result is %.1f\n",f);//输出2.5，计算错误

        int c = 9;
        int d = 2;
        float g = (float)c / d - 1.5f;
        System.out.printf("The true result is %.1f\n",g);//输出3.0，计算正确
    }
}