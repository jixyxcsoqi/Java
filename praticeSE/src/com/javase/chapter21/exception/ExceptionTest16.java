package com.javase.chapter21.exception;

public class ExceptionTest16 {
    public static void main(String[] args) {

        try{
            Test test=new Test(6);

        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
class Test {
    public Test() {
    }

    public Test(int c) throws MyException{
        for (int a =0; a < c; a++) {
            if (a == 5) {

                throw new MyException("a不能等于5");

            }
            System.out.println("a=" + a);
        }

    }
}
/*a=0
a=1
a=2
a=3
a=4
a不能等于5
com.javase.chapter21.exception.MyException: a不能等于5
	at com.javase.chapter21.exception.Test.<init>(ExceptionTest16.java:25)
	at com.javase.chapter21.exception.ExceptionTest16.main(ExceptionTest16.java:7)

进程已结束,退出代码0
*/
