package practice.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetRandomDate {
    public static void main(String[] args) throws ParseException {
        String startTime = "1995-1-1 00:00:00";
        String endTime = "1995-12-31 23:59:59";
        SimpleDateFormat transform = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        Date sTime = transform.parse(startTime);
        Date eTime = transform.parse(endTime);
        System.out.println(startTime + "至" + endTime + "时刻");
        System.out.println(new Date((long) (Math.random()*( eTime.getTime() - sTime.getTime() ) + sTime.getTime())));
    }
}
