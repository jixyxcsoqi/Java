package com.consolidate.javase.freedomPractice;
import java.util.Random;

public class RandomNonRepeat {

            public static void main(String[] args) {
            /*
编写程序，生成5个不重复的随机数[0-100]。重复的话重新生成。
最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。
 */
                int[] arr = new int[5];
                for (int b = 0; b < arr.length; b++) {
                    arr[b]=-1;
                }
                Random r=new Random();

                int result=0;
                while(result< arr.length){
                    int c=r.nextInt(6);
                    System.out.println("我是第"+arr[result]+"个元素："+c);
                    boolean db= d(arr,c);
                    if (db==false){
                        arr[result]=c;
                        result++;
                        System.out.println(db);
                    }

                }
                for (int f=0;f< arr.length;f++){
                    System.out.println(arr[f]);
                }
            }
            public static boolean d(int[] arr,int f){
                for (int e=0;e< arr.length;e++){
                    if (arr[e]==f){
                        return true;
                    }
                }return false;
            }
        }
