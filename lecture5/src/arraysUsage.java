import java.util.Arrays;
public class arraysUsage {
    //输出数组的每个值
    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);
        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }

    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);//使数组的数据从小到大排列（重组）
        System.out.printf("%ndoubleArray: ");
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);//输出顺序排列的新数组
        }

        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);//在数组的每一个地址输入同一值
        displayArray(filledIntArray, "filledIntArray");//使用上面定义的函数

        //复制数组
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        //对比两数组是否相等
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\nintArray %s intArrayCopy\n", (b ? "==" : "!="));
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray\n", (b ? "==" : "!="));

        //找到intArray中的值5
        int location = Arrays.binarySearch(intArray, 5);
        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray\n", location);
        } else {
            System.out.println("5 not found in intArray");
        }
        location = Arrays.binarySearch(intArray, 8763);
        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray\n", location);
        } else {
            System.out.println("8763 not found in intArray");
        }
    }
}