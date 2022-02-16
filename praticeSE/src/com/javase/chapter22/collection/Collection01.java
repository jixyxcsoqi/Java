package com.javase.chapter22.collection;
import java.util.ArrayList;
import java.util.Collection;
public class Collection01 {
    public static void main(String[] args) {


        Collection c=new ArrayList();
        c.add(100);//增加的都是内存地址--自动装箱 Integer x=new Interger;
        c.add(true);
        c.add(new Object());
        System.out.println(c.size());//3
        c.clear();//clera c中所有element
        System.out.println("All elements have been deleted："+c.size());
        c.add(200);
        c.add("索奇");
        boolean b=c.contains("索奇");
        System.out.println("判断c中是否包含此元素："+b);//true
        c.remove(200);
        int residue=c.size();
        System.out.println("删除元素用remove："+residue);//1
        c.clear();
        boolean b2=c.isEmpty();
        System.out.println("judge元素是否为Empty："+b2);//true (return也是boolean) 源代码就是size==0时候判断为空
        c.add("abc");
        c.add("bcd");
        c.add("def");
        c.add("helloword");
        c.add(new Student());
        System.out.println("____________________________________");
        Object[] obj=c.toArray();
        for(int objInput=0;objInput<obj.length;objInput++){
            System.out.println(obj[objInput]);
        }
}
}
class Student{}
/*
3
All elements have been deleted：0
判断c中是否包含此元素：true
删除元素用remove：1
judge元素是否为Empty：true
____________________________________
abc
bcd
def
helloword
com.javase.chapter22.collection.Student@68de145

进程已结束,退出代码0
*/