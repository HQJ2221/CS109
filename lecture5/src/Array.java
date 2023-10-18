public class Array {
    public static void main(String[] args) {
        int total = 0;
        final int ARRAY_LENGTH = 10;//final表示该量为常量（在main中不可再变）
        int[] array; //任何数组的数据类型都是引用类型，必须用关键字new声明数组
        array = new int[ARRAY_LENGTH]; //初始化数组时默认所有数据为0
        System.out.printf("%5s%8s\n", "Index", "Value"); //列标题
        for (int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
            System.out.printf("%5d%8d\n", counter, array[ counter ]);//输出数组的所有数值
        }
        for (int i = 0;i < array.length;i++){
            total += array[i];
        }//数组下的for结构可以增强
        total = 0;
        for (int i : array){ //表示将数组array中所有的元素都提出来并赋给i(i的数据类型必须和数组元素一样)
            total += i;
        }//此乃增强结构，但此结构仅能改变total或i的值，不能改变array的值
        System.out.println(total);
    }
}