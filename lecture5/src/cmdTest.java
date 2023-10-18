public class cmdTest {
    public static void main(String[] args) {
        if (args.length != 3) { //附：在cmd运行，在文件后输入三个变量进行以下运算
            System.out.println("Error: Please re-enter the entire command, including\n" +
                    "an array size, initial value and increment.");
        }else {
            int arrayLength = Integer.parseInt(args[0]);//输入数组大小
            int[] array = new int[arrayLength];//创建数组
            //从命令行获取数组的初值和递增值
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            for (int counter = 0; counter < array.length; counter++)
                array[counter] = initialValue + increment * counter;
            System.out.printf("%s%8s\n", "Index", "Value");
            for (int counter = 0; counter < array.length; counter++)
                System.out.printf("%5d%8d\n", counter, array[ counter ]);
        }
    }
}
