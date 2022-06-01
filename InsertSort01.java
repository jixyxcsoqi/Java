package tenSorting;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
//插入排序：定义一个待插入数的前一个数的下标，然后拿待插入数与前面的数组一一比较，然后交换。
public class InsertSort01 {
    public static void main(String[] args) {
        int a[]={3,44,38,5,47,15,36,26,27,2,46,5,19,50,48};
        for (int i=0;i<a.length;i++){//长度不减一，是因为要留出一个位置方便插入数
            //定义待插入的数
            int insertValue=a[i];
            int insertIndex=i-1;
            while(insertIndex>=0 &&insertValue<a[insertIndex]){//拿a[i]与a[i-1]的前面数组比较}
            a[insertIndex+1]=a[insertIndex];
            insertIndex--;

    }
            a[insertIndex+1]=insertValue;
    }
        System.out.println(Arrays.toString(a));
//        a[2]=a[4];
//        System.out.println(a[2]);
//        System.out.println(a[4]);
    }
}