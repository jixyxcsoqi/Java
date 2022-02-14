package com.javase.chapter21.exception;

public class MyException extends Exception{//compile时异常，当然也可以写RuntimeException
    public MyException(){}
    public MyException(String s){
        super(s);
    }


}
