package com.javase.chapter21.exception;

public class ExceptionTest17 {
    public static void main(String[] args) {
    }


}
//重写的方法不能比之前方法抛出更多，只能更少
class Animal{
   // public void doSome(){}
    public void dosS(int a) throws Exception{
        System.out.println(a);
    }


}
class Cat extends Animal{
       // public void doSome() throws Exception{}//报错
    public void doS(int a) throws Exception{}//正常
}