package chapter20.com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class DataTest01 {
    public static void main(String[] args) throws ParseException{
      Date nowDate=new Date();
      SimpleDateFormat sdf=new SimpleDateFormat();
      String str=sdf.format(nowDate);
      System.out.println(str);
      System.out.println("______________________________");
      SimpleDateFormat sdf02=new SimpleDateFormat("2022-01-10 12:51:30");
      String str02=sdf02.format(nowDate);
      System.out.println(str02);
      System.out.println("____________________________");
      String str03="2008-08-08 08:08:08 888";
      SimpleDateFormat sdf03=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//格式要和String一致，不然报错
      Date nowDate03=sdf03.parse(str03);//字符串转换为Date类型  要在main上写throws ParseException 不然报错

      System.out.println(str03);
      String str04="55";

    }
}
