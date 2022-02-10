package chapter20.com;

import java.util.Date;

public class DateTest02 {
    public static void main(String[] args) {
        long milli=System.currentTimeMillis();
        System.out.println(milli);//获取当前毫秒数
        long begin=System.currentTimeMillis();
        print();
        long end=System.currentTimeMillis();
        System.out.println(end-begin);//统计程序时长

    }
    public static void print(){
        for (int i=0;i<100000;i++){
            System.out.println("this's the"+i);
        }
    }
}
