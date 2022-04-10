package com.bjpowernode.java.annotation5;

public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception{
        // 获取这个类
        Class c = Class.forName("com.bjpowernode.java.annotation5.MyAnnotationTest");
        // 判断类上面是否有@MyAnnotation
		//J判断是否c这个类上是否有MyAnnotation这个注解
        //System.out.println(c.isAnnotationPresent(MyAnnotation.class)); // true
        if(c.isAnnotationPresent(MyAnnotation.class)){//如果有这个注解
            // 获取该注解对象  获取之后转型
            MyAnnotation myAnnotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);
            //System.out.println("类上面的注解对象" + myAnnotation); // @com.bjpowernode.java.annotation5.MyAnnotation()
            // 获取注解对象的属性怎么办？和调接口没区别。
            String value = myAnnotation.value();//直接调注解对象的属性，注解对象的类型是String
            System.out.println(value);//通过反射机制来获取
        }

        // 判断String类上面是否存在这个注解
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation.class)); // false
    }
}
