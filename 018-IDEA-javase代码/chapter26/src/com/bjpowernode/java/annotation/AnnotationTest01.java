package com.bjpowernode.java.annotation;

// 默认情况下，注解可以出现在任意位置jdk5.0之后才加入这种特性。对应day35课堂笔记
/*3.1、注解，或者叫做注释类型，英文单词是：Annotation
		疑问：注解到底是干啥的？？？？？？？？？

	3.2、注解Annotation是一种引用数据类型。编译之后也是生成xxx.class文件。

	3.3、怎么自定义注解呢？语法格式？

		 [修饰符列表] @interface 注解类型名{

		 }
	
	3.4、注解怎么使用，用在什么地方？

		第一：注解使用时的语法格式是：
			@注解类型名
		
		第二：注解可以出现在类上、属性上、方法上、变量上等....
		注解还可以出现在注解类型上。
		RetentionPolicy叫做保持性策略，在源码中可以看到*/

@MyAnnotation
public class AnnotationTest01 {

    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01(){}//构造方法

    @MyAnnotation
    public static void m1(){
        @MyAnnotation
        int i = 100;
    }

    @MyAnnotation
    public void m2(@MyAnnotation //实例方法
                   String name,
                   @MyAnnotation
                   int k){

    }
}

@MyAnnotation
interface MyInterface {

}

@MyAnnotation
enum Season {
    SPRING,SUMMER,AUTUMN,WINTER
}
