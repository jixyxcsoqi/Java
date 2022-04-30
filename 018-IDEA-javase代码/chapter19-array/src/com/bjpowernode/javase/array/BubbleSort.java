package com.bjpowernode.javase.array;

/*
冒泡排序算法
    1、每一次循环结束之后，都要找出最大的数据，放到参与比较的这堆数据的最右边。（冒出最大的那个气泡。）
    2、核心：
        拿着左边的数字和右边的数字比对，当左边 > 右边的时候，交换位置。

原始数据：
3, 2, 7, 6, 8
第1次循环：(最大的跑到最右边。)
2, 3, 7, 6, 8 （3和2比较，2 < 3，所以2和3交换位置）
2, 3, 7, 6, 8 （虽然不需要交换位置：但是3和7还是需要比较一次。）
2, 3, 6, 7, 8 （7和6交换位置）
2, 3, 6, 7, 8 （虽然不需要交换位置：但是3和7还是需要比较一次。）

经过第1次循环，此时剩下参与比较的数据：2, 3, 6, 7
第2次循环：
2, 3, 6, 7 (2和3比较，不需要交换位置)
2, 3, 6, 7 （3和6比较，不需要交换位置）
2, 3, 6, 7 (6和7比较，不需要交换位置)

经过第2次循环，此时剩下参与比较的数据：2, 3, 6
第3次循环：
2, 3, 6 (2和3比较，不需要交换位置)
2, 3, 6 （3和6比较，不需要交换位置）

经过第3次循环，此时剩下参与比较的数据：2, 3
第4次循环：
2, 3 (2和3比较，不需要交换位置)

 */
public class BubbleSort {
    public static void main(String[] args) {

        // 这是int类型的数组对象
        //int[] arr = {3, 2, 7, 6, 8};
        int[] arr = {9, 8, 10, 7, 6, 0, 11};

        // 经过冒泡排序算法对以上数组中元素进行排序
        // 冒泡排序算法的核心是什么？

        // 7条数据，循环6次。以下的代码可以循环6次。
        /*
        for(int i = 0; i < arr.length-1; i++){
            System.out.println(i);
        }
         */

        // 7条数据，循环6次。以下的代码可以让里面循环6次。（冒泡排序的外层循环采用这种方式）
        //int count = 0;
        int count2 = 0;
        for(int i = arr.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                // 不管是否需要交换位置，总之是要比较一次的。
                //count++;
                if(arr[j] > arr[j+1]){
                    // 交换位置。
                    // arr[j] 和 arr[j+1] 交换
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count2++;
                }
            }
        }

        //System.out.println("比较次数：" + count);
        System.out.println("交换位置的次数：" + count2); //13
        // 输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
