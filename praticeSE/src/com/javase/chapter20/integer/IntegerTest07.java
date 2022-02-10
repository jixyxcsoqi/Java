package chapter20.com;

public class IntegerTest07 {
    public static void main(String[] args) {
        Integer integer=10;
        System.out.println(integer+1);//11
        System.out.println("______________________________________");
        int retvalue=Integer.parseInt("666");
        System.out.println(retvalue+1);
        System.out.println("______________________________________");
        double retValue2=Double.parseDouble("666");
        System.out.println(retValue2);
        System.out.println("______________________________________");
        String retValue03=Integer.toBinaryString(3);
        String retValue04=Integer.toHexString(10);
        String retValue05=Integer.toOctalString(10);
        System.out.println(retValue03);
        System.out.println(retValue04);
        System.out.println(retValue05);
        System.out.println("______________________________________");

    }

}
