package chapter20.com;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTest03 {
    public static void main(String[] args) {
        Date time=new Date(1);//不写里面的毫秒,默认打印当前时间,写了不写sdf中的毫秒格式也是不显示毫秒
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//
        String strTime=sdf.format(time);
        System.out.println(sdf.format(new Date()));//当前时间
        System.out.println(strTime);//打印的是北京(东8区)时间=GMT时间+8小时 （GMT指的是格林威治中央区市）1970/01/01 08:00:00 001
        //获取昨天time
        Date yearTime=new Date(System.currentTimeMillis()-1000*60*60*24);
        String yearTime02=sdf.format(yearTime);//用的还是sdf的格式
        System.out.println(yearTime02);
        System.out.println("____________________");
        //获取去年今天时间
        Date lastYear=new Date(System.currentTimeMillis()-1000*60*60*24*366);
        String lastYear02=sdf.format(lastYear);
        System.out.println(lastYear02);

    }
}
