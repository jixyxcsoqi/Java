package com.consolidate.javase.freedomPractice;

public class Anonymous {
    // 静态变量
    static String country;
    // 该类在类的内部，所以称为内部类
    // 由于前面有static，所以称为“静态内部类”
    static class Inner1{
    }

    // 实例变量
    int age;
    // 该类在类的内部，所以称为内部类
    // 没有static叫做实例内部类。
    class Inner2{
    }

    // 方法
    public void doSome(){
        // 局部变量
        int i = 100;
        // 该类在类的内部，所以称为内部类
        // 局部内部类。
        class Inner3{
        }
    }

    public void doOther(){
        // doSome()方法中的局部内部类Inner3，在doOther()中不能用。
    }

    // main方法，入口
    public static void main(String[] args){
        // 调用MyMath中的mySum方法。
        MyMath mm = new MyMath();
		/*
		Compute c = new ComputeImpl();
		mm.mySum(c, 100, 200);
		*/

        //合并（这样写代码，表示这个类名是有的。类名是：ComputeImpl）
        //mm.mySum(new ComputeImpl(), 100, 200);

        // 使用匿名内部类，表示这个ComputeImpl这个类没名字了。
        // 这里表面看上去好像是接口可以直接new了，实际上并不是接口可以new了。
        // 后面的{} 代表了对接口的实现。
        // 不建议使用匿名内部类，为什么？
        // 因为一个类没有名字，没有办法重复使用。另外代码太乱，可读性太差。
        mm.mySum(new Compute(){
            public int sum(int a, int b){
                return a + b;
            }
        }, 200, 300);



    }

}

// 负责计算的接口
interface Compute{

    // 抽象方法
    int sum(int a, int b);
}

// 你自动会在这里编写一个Compute接口的实现类
/*
class ComputeImpl implements Compute{

	// 对方法的实现
	public int sum(int a, int b){
		return a + b;
	}
}
*/

// 数学类
class MyMath{
    // 数学求和方法
    public void mySum(Compute c, int x, int y){
        int retValue = c.sum(x, y);
        System.out.println(x + "+" + y + "=" + retValue);
    }
}
