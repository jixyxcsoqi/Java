package chapter20.com;

import java.util.Locale;

public class StringTest05 {
    public static void main(String[] args) {
        String str="abc";
        String s2="abd";
        System.out.println("str和s2比较，str<s2:"+str.compareTo(s2));

        String s3="abc";
        String s4="abb";
        System.out.println("s3和s4比较,s3>s4："+s3.compareTo(s4));

        String s5="abc";
        String s6="abc";
        int result=s5.compareTo(s6);
        System.out.println("s5和s6比较,s5=s6："+result);
        System.out.println("_________________________________________________");
        // .boolean contains(CharSequence s)
        String s7="jixyxcsoqi.com";
        System.out.println(s7.contains("sq"));//exclusive  false
        System.out.println(s7.contains(".com"));//include  true
        System.out.println("_________________________________________________");

        //. boolean endsWith(String suffix)
        // 判断当前字符串是否以某个子字符串结尾。
        System.out.println("即兴小索奇".endsWith("索奇"));//true
        System.out.println("即兴小索奇".startsWith("兴小"));//false
        System.out.println("_________________________________________________");

        //boolean equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("abc".equalsIgnoreCase("ABC"));//ture
        System.out.println("_________________________________________________");

        String s8="01234567899";
        System.out.println(s8.indexOf("1"));//1
        System.out.println(s8.lastIndexOf("9"));//12
        String s9="即兴小索奇";
        System.out.println(s9.charAt(4));//奇
        System.out.println("_________________________________________________");

        String s10="ABCDEFgg";
        System.out.println(s10.toLowerCase());//转换为小写
        System.out.println(s10.toUpperCase());//转换为大写
        System.out.println("_________________________________________________");


        // 21（掌握）. String中只有一个方法是静态的，不需要new对象
        // 这个方法叫做valueOf
        // 作用：将“非字符串”转换成“字符串”
        String s11= String.valueOf(true);
        String s12= String.valueOf(100);
        String s13 = String.valueOf(3.14);



    }
}
