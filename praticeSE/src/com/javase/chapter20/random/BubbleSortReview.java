package com.javase.chapter20.random;

public class BubbleSortReview {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,8};
        for(int b=arr.length-1;b>0;b--){
            for(int c=0;c<b;c++){
                if(arr[c]>arr[c+1]){
                    int temp;
                    temp=arr[c+1];
                    arr[c+1]=arr[c];
                    arr[c]=temp;
                }
            }
        }
        for (int result=0;result<arr.length;result++){
            System.out.println(arr[result]);
        }

    }
}
