package com.bjpowernode.java.annotation5;

@MyAnnotation("上海浦东区")//可以出现在类上 value也是省略了。这里写了上海……之后执行代码就是这个了
//而不是默认值了-默认值定义 刚刚定的是北京大兴区
public class MyAnnotationTest {

    //@MyAnnotation不能应用在field上，报错，加了ElemenType.FILED就可以了
    int i;

    //@MyAnnotation 不能应用在构造方法上，这是个无参数构造方法
    public MyAnnotationTest(){

    }

    @MyAnnotation//可以出现在方法上
    public void doSome(){

        //@MyAnnotation
        int i;
    }

}
