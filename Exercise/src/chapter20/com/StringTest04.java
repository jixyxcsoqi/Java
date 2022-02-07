package chapter20.com;

public class StringTest04 {
    public static void main(String[] args) {
        byte[] bytes={1,'-',31,32,88,66,'+',127,'b','c','d','e','1'};//只写数字，输出还是数字本身，带引号都是输出对应Ascll图形对应的码

        System.out.println(bytes.length);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String str=new String(bytes);
        System.out.println(str);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String s1=new String(bytes,6,3);
        System.out.println(s1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<bytes.length;i++){
        System.out.println(bytes[i]);
    }
}
}
