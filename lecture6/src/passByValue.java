public class passByValue {//pass-by-value in Java
    public static void main(String[] args) {
        //Java语言中没有引用传递，只有值传递
        //Java语言中的值传递是值的拷贝，而不是引用的拷贝，所以在函数中修改参数的值不会影响到实参
        // 但是如果参数是一个对象的引用，那么修改参数的值会影响到实参，因为对象的引用是值传递
        //Java传递引用类型的参数时，传递的是引用的地址，而不是引用本身
        //Java中的引用类型包括：类、接口、数组
        int a = 3;
        System.out.println("Before:"+a);
        triple(a);
        System.out.println("After:"+a);//函数中修改参数的值不会影响到实参
        int[] arr = {1,2,3};
        for (int j : arr) {
            System.out.println(j);
        }
        triple(arr);
        for (int j : arr) {
            System.out.println(j);//函数中修改参数的值会影响到实参
        }
    }
    public static void triple(int x){
        x *= 3;
    }
    public static void triple(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;
        }
    }
}