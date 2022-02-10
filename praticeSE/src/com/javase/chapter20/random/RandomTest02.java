package com.javase.chapter20.random;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/*编写程序，生成5个不重复的随机数[0-100]。重复的话重新生成。
            最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。*/

public class RandomTest02{
    public static void main(String[] args) {
        long begin=System.currentTimeMillis();

        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        Random random=new Random();

        int index=0;
        while(index<arr.length){
            int k=random.nextInt(5);
            System.out.println("当前随机数是"+k);
            if(!contains(arr,k)){
                arr[index]=k;
                index++;
                System.out.println("--------recode随机数"+k);
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        long end=System.currentTimeMillis();
        System.out.println("用时"+(end-begin)+"毫秒");


    }


    public static boolean contains(int[] arr, int k){
        // 这个方案bug。（排序出问题了。）
        // 对数组进行升序
        //Arrays.sort(arr);
        // 进行二分法查找
        // 二分法查找的结果 >= 0说明，这个元素找到了，找到了表示存在！
        //return Arrays.binarySearch(arr, key) >= 0;



     for(int i=0;i< arr.length;i++){
         if(arr[i]==k){
             return true;
         }
     }return false;
    }
}

