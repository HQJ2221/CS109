public class Exercise1 {
    public static void main(String[] args) {
        double[] myList1,myList2 = new double[8];
        double x = 0;
        myList1 = new double[]{2.5, 5.5, 3.4, 6.4, 7.7, 2.2, 8.9, 0.2};
        System.arraycopy(myList1, 0, myList2, 0, myList1.length);//将myList1的所有元素复制到myList2
        for (int i = 0;i < myList1.length;i++){
            if (i == 0){
                x = myList1[i];
            }else if (i == myList1.length - 1){
                myList1[i] = x;
            }else{
                myList1[i - 1] = myList1[i];
            }
        }
        System.out.print("myList1:");
        for (double num : myList1){
            System.out.printf("%4.1f",num);
        }
        System.out.println();
        System.out.print("myList2:");
        for (double num : myList2){
            System.out.printf("%4.1f",num);
        }
    }
}
