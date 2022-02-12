package com.javase.chapter20.enum01;


public class EnumTest02 {
    public static void main(String[] args) {
        Result r=divide(8,7);
        System.out.println(r==Result.SUCCEED?"good":"badly");


    }

    public static Result divide(int a,int b){
        try{
            int c=a/b;

            return Result.TRUE;//枚举也是一种引用数据类型
        }


        catch (Exception e){
            return Result.FAIL;
        }

    }
}

