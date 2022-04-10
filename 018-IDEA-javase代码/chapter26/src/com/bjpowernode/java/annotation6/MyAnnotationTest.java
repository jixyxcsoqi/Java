package com.bjpowernode.java.annotation6;

import java.lang.reflect.Method;
//3 整个类
public class MyAnnotationTest {

    @MyAnnotation(username = "admin", password = "456456")//1
	//2
    public void doSome(){

    }

    public static void main(String[] args) throws Exception{
        // 获取MyAnnotationTest的doSome()方法上面的注解信息。
		/*想获取1这个信息,就必须获取2这个方法，想获取2，就必须获取整个类*/
        Class c = Class.forName("com.bjpowernode.java.annotation6.MyAnnotationTest");
        // 获取doSome()方法
        Method doSomeMethod = c.getDeclaredMethod("doSome");
        // 判断该方法上是否存在这个注解
        if(doSomeMethod.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = doSomeMethod.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.username());//输出这个对象的这两个属性
            System.out.println(myAnnotation.password());
        }
    }

}
