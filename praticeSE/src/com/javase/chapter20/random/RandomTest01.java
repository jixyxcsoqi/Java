package com.javase.chapter20.random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random=new Random();
        int a=random.nextInt();
        System.out.println(a);
        int b=random.nextInt(101);//表示下一个int类型数据值是101，不能取到101
        System.out.println(b);
    }
}




