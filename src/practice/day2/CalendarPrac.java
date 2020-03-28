package practice.day2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPrac {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        System.out.println(trans.format(calendar.getTime()));
        calendar.add(Calendar.MONTH,+2);
        calendar.set(Calendar.DATE,1);
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        System.out.println(trans.format(calendar.getTime()));
    }
    public static SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
}
