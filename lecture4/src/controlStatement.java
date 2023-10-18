public class controlStatement {
    public static void main(String[] args) {
        //关于for语句循环体中变量的用法
        for(int i = 1;i < 3;i++){
            System.out.println(i);//在for语句内部定义的变量只能用于循环结构内部
        }
        int a;
        for(a = 1;a < 3;a++){
            System.out.println();//在for语句外部定义的变量可以在循环结构外使用
            //总结：定义的变量只在定义行到当前块的结尾（大括号）生效
        }
        System.out.println(a);//这里变量a已经经过循环结构的运算
        /* while语句先进行判断再执行，若判断为false则不执行
           do...while先执行再判断，至少执行一次*/
    }
}

