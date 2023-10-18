public class learnAboutString {
    public static void main(String[] args) {
        //String(字符串)
        //在Java中，字符串是一个对象，它们是char类型的数组
        //char类型用‘’表示，String类型用“”表示
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(charArray);
        System.out.println(str);
        String str1 = new String(charArray, 2, 3);//从charArray的第二个元素开始，截取3个元素
        System.out.println(str1);

        //字符串的比较
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);//这里比较的是s1和s2的地址，所以返回false
        System.out.println(s1.equals(s2));//这里比较的是s1和s2的值，所以返回true

        String s3 = "hello";
        String s4 = "hello";//这里s3和s4的值相同，所以Java只在常量池(String constant pool)创建了一个对象
        //只有String这一引用变量才会指向常量池中的对象，而不是指向堆中的对象
        System.out.println(s3 == s4);//这里比较的是s3和s4的地址，所以返回true

        //字符串的方法
        //length()方法
        //对于其他类型的数组，length是一个属性，但对于字符串，length是一个方法
        //charAt()方法
        //getChars()方法,将字符串的一部分复制到一个字符数组中
        /* compareTo()方法,比较两个字符串的大小，返回值为int类型，如果两个字符串相等，返回0；
           如果第一个字符串大于第二个字符串，返回正数；如果第一个字符串小于第二个字符串，返回负数 */
        //equals()方法,比较两个字符串的内容是否相同
        //equalsIgnoreCase()方法,比较两个字符串的内容是否相同，忽略大小写(仅限英文)
        String s5 = "hello";
        String s6 = s5 + "";
        System.out.println(s5 == s6);//这里比较的是s5和s6的地址，所以返回false
        System.out.println(s5.equals(s6));//这里比较的是s5和s6的值，所以返回true

        //concat()方法,将两个字符串连接起来
        //regionMatches()方法,比较两个字符串的内容是否相同，忽略大小写
        boolean b1 = s5.regionMatches(0, s6, 0, 5);//从s5的第0个元素开始，和s6的第0个元素开始，比较5个元素

        String s7 = "Hello World";
        if (s7.startsWith("He")) {//判断字符串是否以指定的字符串开头
            System.out.println(true);
        }
        if (s7.startsWith("Wo", 6)) {//判断字符串是否以指定的字符串开头，从指定的位置开始
            System.out.println(true);
        }
        if (s7.endsWith("ld")) {//判断字符串是否以指定的字符串结尾
            System.out.println(true);
        }

        //indexOf()方法,返回指定字符在字符串中第一次出现的位置，如果没有出现，返回-1
        //lastIndexOf()方法,返回指定字符在字符串中最后一次出现的位置，如果没有出现，返回-1
        //substring()方法,返回一个新的字符串，它是此字符串的一个子字符串
        s7 = s7.substring(6);//从第6个元素开始截取字符串
        System.out.println("new String s7 = " + s7);

        //replace()方法,返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有oldChar得到的
        //toLowerCase()方法,将字符串中的所有字符转换为小写
        //toUpperCase()方法,将字符串中的所有字符转换为大写
        //trim()方法,返回一个字符串，它是通过删除此字符串的头和尾的空白字符得到的
        //toCharArray()方法,将字符串转换为字符数组

        //valueOf()方法,返回一个String对象，它表示指定的char数组中的字符序列
        char[] charArray1 = {'h', 'e', 'l', 'l', 'o'};
        String str2 = String.valueOf(charArray1);
        System.out.println(str2);
    }
}