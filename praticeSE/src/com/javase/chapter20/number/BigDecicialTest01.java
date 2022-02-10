package com.javase.chapter20.number;

import java.math.BigDecimal;

import static java.lang.Math.abs;

public class BigDecicialTest01 {
    public static void main(String[] args) {
        BigDecimal v=new BigDecimal(100);
        BigDecimal v2=new BigDecimal(100);
        BigDecimal v3=v.add(v2);
        System.out.println(v3);
        BigDecimal abs=new BigDecimal(abs(-100));
        System.out.println(abs);

    }
}
