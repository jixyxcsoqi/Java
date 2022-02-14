package com.javase.chapter21.exception;

public class ExceptionTest08 {
    public static void main(String[] args) {
        //message()方法,获取异常简单描述信息
        NullPointerException e=new NullPointerException("空指针异常");
        String msg=e.getMessage();
        System.out.println(msg);//空指针异常
       /* soureceCode
       public void printStackTrace() {
            printStackTrace(System.err);
        }*/
        //实际上有一个线程专门负责处理异常信息，所以printStackTrace的顺序可能在i下面
        e.printStackTrace();
        for(int i=0;i<1000;i++){
            System.out.println("i="+i);
        }
        System.out.println("Hello World");

    }
}
