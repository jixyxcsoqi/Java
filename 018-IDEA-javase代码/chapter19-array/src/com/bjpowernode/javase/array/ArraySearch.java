package com.bjpowernode.javase.array;
/*
�����Ԫ�ز���
    ����Ԫ�ز��������ַ�ʽ��
        ��һ�ַ�ʽ��һ��һ�������ң�ֱ���ҵ�Ϊֹ��
        �ڶ��ַ�ʽ�����ַ����ң��㷨�������Ч�ʽϸߡ�
 */
public class ArraySearch {
    public static void main(String[] args) {
        // ���������ʾһ�µ�һ�ַ�ʽ
        int[] arr = {4,5,5,87,8};

        // �����ҳ�87���±ꡣ���û�з���-1
        // һ��һ�������ҡ�
        /*
        for(int i = 0; i < arr.length;i ++){
            if(arr[i] == 87){
                System.out.println("87Ԫ�ص��±��ǣ�" + i);
                return;
            }
        }
        // ����ִ�е��˴�����ʾû��87
        System.out.println("87�����ڸ�Ԫ�أ�");
        */

        // ������ϵĳ����װһ��������˼������ʲô����������ʲôֵ��
        // ��ʲô����һ�����������飬�ڶ��������Ǳ����ҵ�Ԫ�ء�
        // ����ֵ�����ر����ҵ����Ԫ�ص��±ꡣ����Ҳ�������-1.
        int index = arraySearch(arr, 5);
        System.out.println(index == -1 ? "��Ԫ�ز�����" : "��Ԫ���±��ǣ�" + index);
    }

    /**
     * �������м���ĳ��Ԫ�ص��±꣨���ص��ǵ�һ��Ԫ�ص��±ꡣ��
     * @param arr ������������
     * @param ele ��������Ԫ��
     * @return ���ڵ���0������ʾԪ�ص��±꣬-1��ʾ��Ԫ�ز�����
     */
    public static int arraySearch(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if(ele == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
