package chapter20.com;

public class IntegerTest08 {
    public static void main(String[] args) {
    String str=5+"0";
    System.out.println(str);
    Integer a=100;
    int b=a+1;
    System.out.println(b);
    System.out.println("____________________");
    Integer c=Integer.valueOf("666");//自动装箱
    int d=c;//自动拆箱
    System.out.println(d);
    System.out.println("______________________________________");
    String str02=String.valueOf(d);
    System.out.println("我是字符串"+str02);




    }
}
