package com.jixyxcsoqi;

public class BubbleArray {
    public static void main(String[] args) {
        int[] arr={5,4,6,8,2,3,7,1};
        int sum=0;
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sum++;
                }
            }
        }
        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }System.out.println(sum);



    }
}
