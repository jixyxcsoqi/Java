package chapter20.com.number;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //#代表任意数字,代表千分位  .代表小数点  0代表不够时候补0 ###，###.##表示加入千分位，保留两个小数。
        //##，###.0000保留四位小数不够时候补0
        DecimalFormat decimal=new DecimalFormat("###,###.##");
        String str=decimal.format(1000);//1,000
        System.out.println(str);
        DecimalFormat decimal02=new DecimalFormat("###,###.0000");
        String str02=decimal02.format(666.01);//666.0100
        System.out.println(str02);


    }
}
