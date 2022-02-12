package com.javase.chapter20.enum01;

public class EnumTest01 {
    public static void main(String[] args) {
      boolean success=result(8,0);
      System.out.println(success?"计算成功":"计算失败");
    }
    public static boolean result(int a,int b){
        try{
            int c=a/b;
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
