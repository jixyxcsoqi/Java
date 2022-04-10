package com.bjpowernode.java.annotation5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*J
看源代码 public @interface Target{
	ElementType[] value();
}
以下都是源代码中显示 
value可以省略 value后面是个数组{} 数组里面每一个元素是ElementType，而ElementType是个enum枚举
public enum ElementType{
		TYPE，
		FIELD，
		METHOD，
		PARAMETER，
		CONSTRUCTURE，
}*/

//只允许该注解可以标注类、方法
@Target({ElementType.TYPE, ElementType.METHOD})
// 希望这个注解可以被反射，被反射机制所读取。点击RetentionPolicy去查看 也是RetentionPolicy value();
@Retention(RetentionPolicy.RUNTIME)//(RetentionPolicy.SOURCE)的话不能被反射机制所读取到
public @interface MyAnnotation {  //上面写的这两个注解都是元注解

    /*
    value属性。
     */
    String value() default "北京大兴区";
}
