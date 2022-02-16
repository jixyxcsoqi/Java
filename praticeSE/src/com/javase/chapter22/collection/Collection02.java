package com.javase.chapter22.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Collection02 {
    public static void main(String[] args) {//迭代器都是通用的。无论是Arraylist还是HashSet
      Collection c=new ArrayList();//有序可重复
      c.add(123);
      c.add("abc");
      c.add(456);
      c.add("def");
      c.add(789);
      c.add("ght");
      c.add(new Object());
      Iterator it=c.iterator();//拿到迭代器
      while (it.hasNext()){
          Object obj=it.next();
          System.out.println(obj);
        }
      System.out.println("_______________");
      Collection co=new HashSet();//无序不可重复
      co.add(1);
      co.add(2);
      co.add(3);
      co.add(4);
      co.add(5);
      co.add(6);
      co.add(7);
      co.add(8);
      co.add(66);
      co.add(88);
      Iterator it02=co.iterator();
      while(it02.hasNext()){
          Object obj02=it02.next();
          System.out.println(obj02);
      }
    }
}
/*
123
abc
456
def
789
ght
java.lang.Object@21b8d17c
_______________
1
2
66
3
4
5
6
7
8
88

进程已结束,退出代码0
*/