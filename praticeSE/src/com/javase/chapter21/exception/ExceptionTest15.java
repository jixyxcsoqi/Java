package com.javase.chapter21.exception;

public class ExceptionTest15 {
    public static void main(String[] args) {
        MyException e=new MyException("用户名不能为空");
        e.printStackTrace();
        String msg=e.getMessage();
        System.out.println(msg);
    }
}
