public class wrapperAndCharacter {
    public static void main(String[] args) {
        //类字符是原始类型char的类型包装器类
        //Character提供了方法 (主要是静态方法)，以方便处理单个char值
        //Character类的构造方法都是私有的，所以不能创建Character对象

        //Character类的常用方法
        //isDigit()方法,判断指定的字符是否为数字
        //isLetter()方法,判断指定的字符是否为字母
        //isLowerCase()方法,判断指定的字符是否为空白字符

        //创建新的Character对象(包)
        //Character c1 = new Character('a'); 这个方法已经过时了
        Character c1 = Character.valueOf('a');//这个方法不过时，推荐使用
    }
}
