package chapter20.com;

public class StringTest02 {
    public static void main(String[] args){
        String strOne=new String("one");
        String strTwo=new String("two");
        System.out.println("one".equals(strOne));//true

        String strThree=new String("one");
        System.out.println(strThree.equals(strOne));//true
        String b="123";
        String c="123";
        System.out.println(b==c);//true
        System.out.println(strThree==strOne);//false
    }
}
